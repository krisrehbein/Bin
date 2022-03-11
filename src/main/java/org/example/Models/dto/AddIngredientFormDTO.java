
package org.example.Models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AddIngredientFormDTO  {



    @NotNull
    @NotBlank
    @Size(min = 2, max = 30, message = "Nothing useful is one letter, and anything longer than thirty is probably ridiculous...")
    private String ingredient;

    private Integer amount;

    public String getIngredient() {
        return ingredient;
    }


    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount= amount;
    }

}
