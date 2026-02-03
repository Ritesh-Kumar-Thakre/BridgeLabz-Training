package com.functionalinterfaces.staticinterfaces.unitconversiontool;

public class ConversionTool {
	public static void main(String[] args) {
		double km = 25;
		double kg = 80;

		double kgtolbs = UnitConversions.kgToLBS(kg);
		System.out.println(kgtolbs);
		double kmtomiles = UnitConversions.kmToMiles(km);
		System.out.println(kmtomiles);
	}
}
