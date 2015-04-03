package com.seavus.pizzashop;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private List<String> ingredients = new ArrayList<String>();

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pizza with ");
        sb.append(ingredients);
        return sb.toString();
    }
}
