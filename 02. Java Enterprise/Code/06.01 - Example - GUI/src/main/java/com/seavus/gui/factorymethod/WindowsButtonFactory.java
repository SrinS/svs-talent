package com.seavus.gui.factorymethod;

import com.seavus.gui.Button;
import com.seavus.gui.WindowsButton;

public class WindowsButtonFactory extends ButtonFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
