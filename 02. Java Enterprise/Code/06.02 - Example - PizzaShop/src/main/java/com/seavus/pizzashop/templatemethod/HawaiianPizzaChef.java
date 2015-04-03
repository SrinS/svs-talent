package com.seavus.pizzashop.templatemethod;

import com.seavus.pizzashop.Pizza;

public class HawaiianPizzaChef extends PizzaChef {

    @Override
    protected void addIngredients(Pizza pizza) {
        pizza.addIngredient("Cheese");
        pizza.addIngredient("Ham");
        pizza.addIngredient("Pineapple");
    }
}
