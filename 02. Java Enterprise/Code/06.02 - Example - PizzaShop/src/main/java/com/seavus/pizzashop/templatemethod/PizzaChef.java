package com.seavus.pizzashop.templatemethod;

import com.seavus.pizzashop.Pizza;

public abstract class PizzaChef {

    public Pizza prepare() {
        final Pizza pizza = new Pizza();
        prepareCrust(pizza);
        addIngredients(pizza);
        bake(pizza);
        return pizza;
    }

    private void prepareCrust(Pizza pizza) {
        System.out.println("Preparing crust...");
    }

    protected abstract void addIngredients(Pizza pizza);

    private void bake(Pizza pizza) {
        System.out.println("Baking...");
    }
}
