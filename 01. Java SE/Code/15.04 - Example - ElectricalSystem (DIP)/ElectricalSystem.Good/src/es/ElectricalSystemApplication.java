package es;

import es.control.PowerButton;
import es.control.PoweredDevice;
import es.fan.Fan;
import es.lamp.Lamp;

public class ElectricalSystemApplication {

    public static void main(String[] args) {

        final PoweredDevice lamp = new Lamp();
        final PowerButton lampButton = new PowerButton(lamp);
        lampButton.click();

        final PoweredDevice fan = new Fan();
        final PowerButton fanButton = new PowerButton(fan);
        fanButton.click();
    }
}
