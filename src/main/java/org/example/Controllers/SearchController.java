package org.example.Controllers;

import com.google.gson.Gson;
import org.example.Models.Search;
import org.example.Models.data.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Controller
@RequestMapping("search")
public class    SearchController {

    @Autowired
    private SearchRepository searchRepository;

    @RequestMapping("")
    public String search(Model model) {
        String name = "UserName";
        model.addAttribute("name", name);
        return "search";
    }


    public String getRecipeInfo(URI uri) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(uri)
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

    @PostMapping("results")
    public Object getApiResults(@ModelAttribute Search search, @RequestParam String searchString, Model model) throws Exception {

        URI url = new URI("https://api.edamam.com/api/recipes/v2?type=public&q=" + searchString + "&app_id=98848355&app_key=a2eab94993145d573991625b087c0ac9");
        Gson gson = new Gson();
        Search api = gson.fromJson(getRecipeInfo(url), Search.class);

        model.addAttribute("pullOutData", searchRepository.findAll());
        model.addAttribute("results", api.getHits());

        return "results";
    }
}