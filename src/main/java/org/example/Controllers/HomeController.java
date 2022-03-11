package org.example.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {


    @RequestMapping("")
    public String index() {

        return "index";
}
    @GetMapping("aboutme")
    public String aboutme (Model model) {

        return "aboutme";
    }





}
