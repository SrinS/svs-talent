package com.seavus.pizzashop.templatemethod;

import com.seavus.pizzashop.Pizza;

public class PizzaShopTemplateMethodApplication {

    public static void main(String[] args) {

        final Pizza capricciosaPizza = new CapricciosaPizzaChef().prepare();
        System.out.println(capricciosaPizza);

        System.out.println();

        final Pizza hawaiianPizza = new HawaiianPizzaChef().prepare();
        System.out.println(hawaiianPizza);
    }
}
