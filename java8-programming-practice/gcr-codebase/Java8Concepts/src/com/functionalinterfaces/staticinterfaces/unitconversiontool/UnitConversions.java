package com.functionalinterfaces.staticinterfaces.unitconversiontool;

public interface UnitConversions {
	static double kmToMiles(double value) {
		return value * 0.63;
	}

	static double kgToLBS(double value) {
		return value * 2.21;
	}
}
