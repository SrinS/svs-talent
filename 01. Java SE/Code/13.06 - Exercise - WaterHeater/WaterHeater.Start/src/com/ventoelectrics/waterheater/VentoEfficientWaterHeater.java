package com.ventoelectrics.waterheater;

public class VentoEfficientWaterHeater extends VentoBaseWaterHeater {

	public VentoEfficientWaterHeater(VentoThermoregulator thermoregulator,
			VentoHeater heater, VentoPowerSwitch powerSwitch) {
		super(thermoregulator, heater, powerSwitch);
	}

	public static void main(String[] args) throws Exception {

		final VentoThermometer ventoThermometer = new VentoThermometer();
		final VentoHeater ventoHeater = new VentoHeater();
		final VentoPowerSwitch ventoPowerSwitch = new VentoPowerSwitch();

		final VentoThermoregulator ventoThermoregulator = null; // ACME efficient thermoregulator instance. 

		final VentoEfficientWaterHeater waterHeater = new VentoEfficientWaterHeater(
				ventoThermoregulator, ventoHeater, ventoPowerSwitch);
		waterHeater.run();
	}
}
