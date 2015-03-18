package com.ventoelectrics.waterheater;

import java.util.Random;

public class VentoThermometer {
	
	private Random random = new Random(System.currentTimeMillis());

	public Integer getTemperature() {
		return random.nextInt(60);
	}
}
