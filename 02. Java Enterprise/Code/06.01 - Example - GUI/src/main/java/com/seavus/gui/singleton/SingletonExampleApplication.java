package com.seavus.gui.singleton;

import com.seavus.gui.WindowManager;

public class SingletonExampleApplication {

    public static void main(String[] args) {

//        new WindowManager(); // Not possible.
        System.out.println(WindowManager.getInstance() == WindowManager.getInstance());
    }
}
