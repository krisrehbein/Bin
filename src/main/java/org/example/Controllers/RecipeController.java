package org.example.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("addrecipe")
public class RecipeController {

    @RequestMapping("")
    public String addrecipe (Model model) {

        return "addrecipe";
    }

}

//TODO: add recipe mapping to SQL tables. ID fields are name, amount, ingredients, instructions.
//TODO: think about how each ingredient will have a specific amount tied to only it. In contrast one recipe will have many ingredients.

