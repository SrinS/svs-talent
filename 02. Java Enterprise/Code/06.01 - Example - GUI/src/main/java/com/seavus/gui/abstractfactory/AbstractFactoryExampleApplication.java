package com.seavus.gui.abstractfactory;

import com.seavus.gui.OsType;
import com.seavus.gui.UnsupportedOsTypeException;
import com.seavus.gui.WindowManager;

public class AbstractFactoryExampleApplication {

    public static void main(String[] args) {
        final GuiFactory guiFactory;
        final OsType osType = WindowManager.getInstance().getOsType();
        switch (osType) {
            case WINDOWS: {
                guiFactory = new WindowsGuiFactory();
                break;
            }
            case LINUX: {
                guiFactory = new LinuxGuiFactory();
                break;
            }
            default: throw new UnsupportedOsTypeException();
        }

        guiFactory.createButton().click();
        guiFactory.createLabel().render();
    }
}
