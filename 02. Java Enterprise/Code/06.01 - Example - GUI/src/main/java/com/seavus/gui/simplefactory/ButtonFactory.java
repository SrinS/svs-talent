package com.seavus.gui.simplefactory;

import com.seavus.gui.*;

public class ButtonFactory {

    public static Button createButton() {
        final OsType osType = WindowManager.getInstance().getOsType();
        switch (osType) {
            case WINDOWS:
                return new WindowsButton();
            case LINUX:
                return new LinuxButton();
            default:
                throw new UnsupportedOsTypeException();
        }
    }
}
