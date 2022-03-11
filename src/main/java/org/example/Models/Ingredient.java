package org.example.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;


@Entity
@NotNull
public class Ingredient {

//TODO : HOOK THIS UP TO SQL

    @Id
    @GeneratedValue
    private int id;
    private static int nextID = 1;

    public int getId() {
        return id;
    }

    @NotNull
    private String name;

    private int amount;



    public Ingredient(String name, int amount) {
        this.name = name;
        this.amount = amount;

    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Ingredient(){}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


























