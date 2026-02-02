package com.lambdas.lambdaexpressions.smarthomelightingautomation;

import java.time.LocalTime;

public class SmartHomeLightingAutomation {
	public static void main(String[] args) {
		// motion
		int motion = 0;
		LightAction motionAction = () -> {
			if (motion <= 0) {
				System.out.println("Light's on");
			} else {
				System.out.println("Light's off");
			}
		};
		motionAction.action();

		// Time of day
		LocalTime currentTime = LocalTime.now();
		LightAction timeAction = () -> {
			if (currentTime.isAfter(LocalTime.of(18, 0)) && currentTime.isBefore(LocalTime.of(6, 0))) {
				System.out.println("Light's on");
			} else {
				System.out.println("Light's off");
			}
		};
		timeAction.action();

		// Voice Commands
		String str = "On";
		LightAction voiceCommand = () -> {
			if (str.equalsIgnoreCase("On")) {
				System.out.println("Light's on");
			} else if (str.equalsIgnoreCase("Off")) {
				System.out.println("Light's off");
			} else {
				System.out.println("Wrong command");
			}
		};
		voiceCommand.action();
	}
}
