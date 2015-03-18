package com.ventoelectrics.waterheater;

public class VentoHeater implements VentoPoweredDevice {
	
	private boolean powerEnabled = false;
	
	@Override
	public void enablePower() {
		powerEnabled = true;
	}

	@Override
	public void disablePower() {
		powerEnabled = false;
	}
	
	public void enable() {
		if (!powerEnabled) {
			return;
		}
		System.out.println("VentoHeater.enable()");
	}
	
	public void disable() {
		if (!powerEnabled) {
			return;
		}
		System.out.println("VentoHeater.disable()");
	}
}
