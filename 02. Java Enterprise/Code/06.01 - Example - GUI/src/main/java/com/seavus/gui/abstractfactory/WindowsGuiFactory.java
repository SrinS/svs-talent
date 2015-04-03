package com.seavus.gui.abstractfactory;

import com.seavus.gui.Button;
import com.seavus.gui.Label;
import com.seavus.gui.WindowsButton;
import com.seavus.gui.WindowsLabel;

public class WindowsGuiFactory extends GuiFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Label createLabel() {
        return new WindowsLabel();
    }
}
