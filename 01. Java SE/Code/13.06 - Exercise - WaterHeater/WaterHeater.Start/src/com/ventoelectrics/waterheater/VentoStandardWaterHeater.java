package com.ventoelectrics.waterheater;

public class VentoStandardWaterHeater extends VentoBaseWaterHeater {

	public VentoStandardWaterHeater(VentoThermoregulator thermoregulator,
			VentoHeater heater, VentoPowerSwitch powerSwitch) {
		super(thermoregulator, heater, powerSwitch);
	}

	public static void main(String[] args) throws Exception {

		final VentoThermometer ventoThermometer = new VentoThermometer();
		final VentoHeater ventoHeater = new VentoHeater();
		final VentoPowerSwitch ventoPowerSwitch = new VentoPowerSwitch();

		final VentoThermoregulator ventoThermoregulator = null; // ACME standard thermoregulator instance. 

		final VentoStandardWaterHeater waterHeater = new VentoStandardWaterHeater(
				ventoThermoregulator, ventoHeater, ventoPowerSwitch);
		waterHeater.run();
	}
}
