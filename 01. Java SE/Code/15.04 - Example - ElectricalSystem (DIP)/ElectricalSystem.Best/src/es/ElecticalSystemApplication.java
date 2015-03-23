package es;

import es.button.PowerButton;
import es.button.PoweredDevice;
import es.fan.Fan;
import es.lamp.Lamp;

public class ElecticalSystemApplication {

    public static void main(String[] args) {

        final Lamp lamp = new Lamp();
        final PoweredDevice lampAdapter = new PowerButtonLampAdapter(lamp);
        final PowerButton lampButton = new PowerButton(lampAdapter);
        lampButton.click();

        final Fan fan = new Fan();
        final PoweredDevice fanAdapter = new PowerButtonFanAdapter(fan);
        final PowerButton fanButton = new PowerButton(fanAdapter);
        fanButton.click();
    }
}
