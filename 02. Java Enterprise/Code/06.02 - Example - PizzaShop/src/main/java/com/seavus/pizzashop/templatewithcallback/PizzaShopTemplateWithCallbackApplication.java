package com.seavus.pizzashop.templatewithcallback;

import com.seavus.pizzashop.Pizza;

public class PizzaShopTemplateWithCallbackApplication {

    public static void main(String[] args) {

        final Pizza capricciosaPizza = new PizzaChef().prepare(new CapricciosaPizzaIngredientSetter());
        System.out.println(capricciosaPizza);

        System.out.println();

        final Pizza hawaiianPizza = new PizzaChef().prepare(new HawaiianPizzaIngredientSetter());
        System.out.println(hawaiianPizza);
    }
}
