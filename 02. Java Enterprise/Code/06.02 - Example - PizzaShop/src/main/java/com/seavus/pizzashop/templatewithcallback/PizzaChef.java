package com.seavus.pizzashop.templatewithcallback;

import com.seavus.pizzashop.Pizza;

public class PizzaChef {

    public Pizza prepare(PizzaIngredientSetter pizzaIngredientSetter) {
        final Pizza pizza = new Pizza();
        prepareCrust(pizza);
        pizzaIngredientSetter.addIngredients(pizza);
        bake(pizza);
        return pizza;
    }

    private void prepareCrust(Pizza pizza) {
        System.out.println("Preparing crust...");
    }

    private void bake(Pizza pizza) {
        System.out.println("Baking...");
    }
}
