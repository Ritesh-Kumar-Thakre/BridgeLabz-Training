package day2.CallCenter;

public class CallCenter {
	public static void main(String[] args) {
		Customer c1 = new Customer("Ritesh", 21, "9131993514", 19);
		Customer c2 = new Customer("Ram", 24, "9134324514", 3);
		Customer c3 = new Customer("Rohan", 26, "9138462514", 18);

		Call call = new Call();
		call.call(c1.number);
		call.callCount(c1);
		call.addCall(c1);

		call.call(c1.number);
		call.callCount(c1);
		call.addCall(c1);

		call.call(c2.number);
		call.callCount(c2);
		call.addCall(c2);

		call.call(c3.number);
		call.callCount(c3);
		call.addCall(c3);
		
		call.displayList();

	}
}
