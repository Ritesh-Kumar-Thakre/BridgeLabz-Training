package day8.FoodFest;

public class FoodFest {
	public static void main(String[] args) {
		Stall s1 = new Stall("Samosa", 123);
		Stall s2 = new Stall("Momo", 200);
		Stall s3 = new Stall("Pizza", 150);
		Zones z1 = new Zones();
		z1.zone.add(s1);
		z1.zone.add(s2);
		z1.zone.add(s3);
		z1.printZone();

		Stall s4 = new Stall("South Indian", 80);
		Stall s5 = new Stall("Western Food", 110);
		Stall s6 = new Stall("Tea", 300);
		Zones z2 = new Zones();
		z2.zone.add(s4);
		z2.zone.add(s5);
		z2.zone.add(s6);
		z2.printZone();

		Stall s7 = new Stall("Juice", 40);
		Stall s8 = new Stall("Non-Veg", 70);
		Zones z3 = new Zones();
		z3.zone.add(s7);
		z3.zone.add(s8);
		z3.printZone();

		CombineZone combineZone = new CombineZone();
		combineZone.mainList.add(z1);
		combineZone.mainList.add(z2);
		combineZone.mainList.add(z3);

		combineZone.mergeSort(combineZone.mainList, 0, combineZone.mainList.size() - 1);
		combineZone.printMainList();
	}
}
