package es.lamp;

import es.control.PoweredDevice;

public class Lamp implements PoweredDevice {

    @Override
    public void enable() {
        System.out.println("es.lamp.Lamp.enable");
    }

    @Override
    public void disable() {
        System.out.println("es.lamp.Lamp.disable");
    }
}
