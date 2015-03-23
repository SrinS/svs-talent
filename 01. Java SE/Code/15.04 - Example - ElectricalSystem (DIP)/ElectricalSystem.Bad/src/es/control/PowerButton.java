package es.control;

import es.lamp.Lamp;

public class PowerButton {

	private boolean enabled = false;

    private Lamp lamp;

    public PowerButton(Lamp lamp) {
        this.lamp = lamp;
    }

    public void click() {

        enabled = !enabled;

        if (enabled) {
            lamp.turnOn();
        } else {
            lamp.turnOff();
        }
    }
}
