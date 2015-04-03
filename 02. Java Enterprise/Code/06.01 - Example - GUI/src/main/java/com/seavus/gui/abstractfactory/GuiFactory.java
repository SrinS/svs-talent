package com.seavus.gui.abstractfactory;

import com.seavus.gui.Button;
import com.seavus.gui.Label;

public abstract class GuiFactory {

    public abstract Button createButton();

    public abstract Label createLabel();
}
