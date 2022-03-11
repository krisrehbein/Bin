package org.example.Models.data;

import org.example.Models.Ingredient;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class IngredientData {

    private static Map<Integer, Ingredient> ingredients = new HashMap<>();

    public static Collection<Ingredient> getAll() {
        return ingredients.values();
    }

    public static void add(Ingredient ingredient) {
        ingredients.put(ingredient.getId(), ingredient);
    }

    public static Ingredient getById(Integer id) {
        return ingredients.get(id);
    }

    public static void remove(Integer id) {
        if (ingredients.containsKey(id)) {
            ingredients.remove(id);
        }
    }

}
