package com.seavus.pizzashop.templatewithcallback;

import com.seavus.pizzashop.Pizza;

public class HawaiianPizzaIngredientSetter implements PizzaIngredientSetter {

    @Override
    public void addIngredients(Pizza pizza) {
        pizza.addIngredient("Cheese");
        pizza.addIngredient("Ham");
        pizza.addIngredient("Pineapple");
    }
}
