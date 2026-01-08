package day5.ParkEase;

import java.util.*;

public class ParkingManager {

	private List<ParkingSlot> slots = new ArrayList<>();

	public void addSlot(ParkingSlot slot) {
		slots.add(slot);
	}

	public ParkingSlot findAvailableSlot(String vehicleType) {
		for (ParkingSlot slot : slots) {
			if (slot.isAvailable() && vehicleType.equals(slot.getVehicleTypeAllowed())) {
				return slot;
			}
		}
		return null;
	}

	public void showAvailability() {
		System.out.println("\n--- Parking Slot Status ---");
		for (ParkingSlot slot : slots) {
			System.out.println("Slot " + slot.getSlotId() + " | Available: " + slot.isAvailable());
		}
	}
}
