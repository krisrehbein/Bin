
package org.example.Controllers;

import org.example.Models.Ingredient;
import org.example.Models.data.IngredientRepository;
import org.example.Models.dto.AddIngredientFormDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
public class IngController {

    @Autowired
    private IngredientRepository ingredientRepository;



    @GetMapping("ingredients/addingredients")
    public String renderDataform(Model model) {
        model.addAttribute("title","Create Ingredient");
        model.addAttribute(new AddIngredientFormDTO());
        model.addAttribute("ingredient", new Ingredient());
        return "ingredients/addingredients";


    }


    @PostMapping("ingredients/addingredients")
    public String processaddingredientsform(@ModelAttribute @Valid Ingredient newIngredient,
                                            Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title","Create Event");
            return "ingredients/addingredients";
        }
        ingredientRepository.save(newIngredient);
        return "ingredients/addingredients" ;
    }

}
