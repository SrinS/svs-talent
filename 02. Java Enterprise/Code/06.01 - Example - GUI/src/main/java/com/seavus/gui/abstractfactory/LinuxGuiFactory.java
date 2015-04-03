package com.seavus.gui.abstractfactory;

import com.seavus.gui.Button;
import com.seavus.gui.Label;
import com.seavus.gui.LinuxButton;
import com.seavus.gui.LinuxLabel;

public class LinuxGuiFactory extends GuiFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Label createLabel() {
        return new LinuxLabel();
    }
}
