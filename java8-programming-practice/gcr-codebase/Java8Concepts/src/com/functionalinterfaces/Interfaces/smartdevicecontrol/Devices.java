package com.functionalinterfaces.Interfaces.smartdevicecontrol;

import java.util.Scanner;

public class Devices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SmartDevice lights = new SmartDevice() {
			@Override
			public void turnOn() {
				System.out.println("Lights on");
			}

			@Override
			public void turnOff() {
				System.out.println("Lights off");
			}
		};
		lights.turnOn();
		lights.turnOff();

		SmartDevice AC = new SmartDevice() {
			@Override
			public void turnOn() {
				System.out.println("\nAC on");
			}

			@Override
			public void turnOff() {
				System.out.println("AC off");
			}
		};
		AC.turnOn();
		AC.turnOff();

		SmartDevice TV = new SmartDevice() {
			@Override
			public void turnOn() {
				System.out.println("\nTV on");
			}

			@Override
			public void turnOff() {
				System.out.println("TV off");
			}
		};
		TV.turnOn();
		TV.turnOff();
	}
}
