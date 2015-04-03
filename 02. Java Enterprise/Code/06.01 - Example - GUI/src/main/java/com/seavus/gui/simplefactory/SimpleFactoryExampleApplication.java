package com.seavus.gui.simplefactory;

import com.seavus.gui.Button;

public class SimpleFactoryExampleApplication {

    public static void main(String[] args) {
        final Button button = ButtonFactory.createButton();
        button.click();
    }
}
