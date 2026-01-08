package day5.ParkEase;

public class ParkingSlot {

	private int slotId;
	private boolean isOccupied;
	private String vehicleTypeAllowed;
	private Vehicle parkedVehicle;

	public ParkingSlot(int slotId, String vehicleTypeAllowed) {
		this.slotId = slotId;
		this.vehicleTypeAllowed = vehicleTypeAllowed;
		this.isOccupied = false;
	}
	
	public String getVehicleTypeAllowed() {
	    return vehicleTypeAllowed;
	}

	public boolean assignVehicle(Vehicle vehicle) {
		if (isOccupied) {
			System.out.println("Slot already occupied");
			return false;
		}

		if (!vehicle.getClass().getSimpleName().equals(vehicleTypeAllowed)) {
			System.out.println("Vehicle type not allowed in this slot");
			return false;
		}

		this.parkedVehicle = vehicle;
		this.isOccupied = true;
		System.out.println("Vehicle parked in slot " + slotId);
		return true;
	}

	public double releaseVehicle(int hours) {
		if (!isOccupied) {
			System.out.println("Slot is already empty");
			return 0;
		}

		double amount = parkedVehicle.calculateCharges(hours);
		parkedVehicle = null;
		isOccupied = false;

		return amount;
	}

	public boolean isAvailable() {
		return !isOccupied;
	}

	public int getSlotId() {
		return slotId;
	}
}
