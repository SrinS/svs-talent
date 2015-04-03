package com.seavus.gui.factorymethod;

import com.seavus.gui.Button;
import com.seavus.gui.UnsupportedOsTypeException;
import com.seavus.gui.WindowManager;

public class FactoryMethodExampleApplication {

    public static void main(String[] args) {
        final ButtonFactory buttonFactory;
        switch (WindowManager.getInstance().getOsType()) {
            case WINDOWS: {
                buttonFactory = new WindowsButtonFactory();
                break;
            }
            case LINUX: {
                buttonFactory = new LinuxButtonFactory();
                break;
            }
            default:
                throw new UnsupportedOsTypeException();
        }

        buttonFactory.createButton().click();
    }
}
