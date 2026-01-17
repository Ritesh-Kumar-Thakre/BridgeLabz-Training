package day3.ParcelTracker;

public class ParcelTracker {
	public static void main(String[] args) {
		Parcels parcel = new Parcels("Mobile", 15000, 1, "India");
		parcel.parcelDetails();
		Stage s1 = new Stage("Packed");
		Stage s2 = new Stage("Shipped");
		Stage s3 = new Stage("In Transit");
		Stage s4 = new Stage("Delivered");

		Root root = new Root();
		root.add(s1.name);
		root.add(s2.name);
		root.add(s3.name);
		root.add(s4.name);
		root.printRoot();

		root.addCustomCheckpoint("Packed", "Picked Up");
		root.printUpdatedRoot();

		root.addCustomCheckpoint("Picked Up", "Departed Origin Facility");
		root.printUpdatedRoot();

		root.trackParcel();
	}
}
