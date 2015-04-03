package com.seavus.gui;

public class WindowManager {

    private static WindowManager instance = new WindowManager();

    private WindowManager() {
    }

    public static WindowManager getInstance() {
        return instance;
    }

    public OsType getOsType() {
        final String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("windows")) {
            return OsType.WINDOWS;
        } else if (osName.contains("linux")) {
            return OsType.LINUX;
        } else {
            throw new UnsupportedOsTypeException();
        }
    }
}
