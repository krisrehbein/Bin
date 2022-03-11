
package org.example.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Objects;

@Entity
public class Search {

    @Id
    @GeneratedValue
    private int id;
    public ArrayList<Object> hits;
    private String label;
    private String recipe;
    private String ingredient;

    public Search(ArrayList<Object> hits, String label) {
        super();
        this.hits = hits;
        this.label = label;
    }

    public Search() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Object> getHits() {
        return hits;
    }

    public void setHits(ArrayList<Object> hits) {
        this.hits = hits;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Search)) return false;
        Search search = (Search) o;
        return id == search.id && Objects.equals(hits, search.hits) && Objects.equals(label, search.label) && Objects.equals(recipe, search.recipe) && Objects.equals(ingredient, search.ingredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hits, label, recipe, ingredient);
    }

    @Override
    public String toString() {
        return "I ADDED THIS FOR: " + hits;
    }
}