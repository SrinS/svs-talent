package com.seavus.gui.factorymethod;

import com.seavus.gui.Button;
import com.seavus.gui.LinuxButton;
import com.seavus.gui.WindowsButton;

public class LinuxButtonFactory extends ButtonFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
