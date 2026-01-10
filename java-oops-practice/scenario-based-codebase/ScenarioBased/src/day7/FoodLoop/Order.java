package day7.FoodLoop;

import java.util.Scanner;
import java.util.ArrayList;;

public class Order implements IOrderable {
	ArrayList<FoodItem> items = new ArrayList<>();
	ArrayList<String> orderItem = new ArrayList<>();
	ArrayList<Integer> contity = new ArrayList<>();
	ArrayList<Double> orderPrice = new ArrayList<>();

	public double totalPrice() {
		double bill = 0;
		for (int i = 0; i < orderPrice.size(); i++) {
			bill += (contity.get(i) * orderPrice.get(i));
		}
		return bill;
	}

	public double applyDiscount(double bill) {
		if (bill < 500) {
			bill -= 10;
		} else if (bill > 500 && bill < 1500) {
			bill *= 0.10;
		} else {
			bill *= 0.15;
		}
		return bill;
	}

	@Override
	public void placeOrder() {

	    double bill = 0;

	    // 1️⃣ Validate stock for every ordered item
	    for (int i = 0; i < orderItem.size(); i++) {
	        String orderedName = orderItem.get(i);
	        int qty = contity.get(i);

	        boolean found = false;

	        for (FoodItem item : items) {
	            if (item.name.equalsIgnoreCase(orderedName)) {
	                found = true;

	                if (qty > item.availability) {
	                    System.out.println(" Not enough stock for " + item.name);
	                    return;
	                }
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Item not found: " + orderedName);
	            return;
	        }
	    }

	    // 2️ Calculate bill
	    for (int i = 0; i < contity.size(); i++) {
	        bill += contity.get(i) * orderPrice.get(i);
	    }

	    // 3️⃣ Apply discount
	    double finalBill = applyDiscount(bill);

	    // 4️⃣ Reduce stock
	    for (int i = 0; i < orderItem.size(); i++) {
	        String orderedName = orderItem.get(i);
	        int qty = contity.get(i);

	        for (FoodItem item : items) {
	            if (item.name.equalsIgnoreCase(orderedName)) {
	                item.availability -= qty;
	            }
	        }
	    }

	    // 5️⃣ Show output
	    System.out.println("\n===== Order Summary =====");
	    
	    for (int i = 0; i < orderItem.size(); i++) {
	        System.out.println("Item: " + orderItem.get(i));
	        System.out.println("Price: ₹" + orderPrice.get(i));
	        System.out.println("Quantity: " + contity.get(i));
	        System.out.println("Total: ₹" + (orderPrice.get(i) * contity.get(i)));
	        System.out.println("---------------------------");
	    }
	    
	    System.out.println("Original Bill: ₹" + bill);
	    System.out.println("Final Bill: ₹" + (totalPrice()-finalBill));
	    System.out.println("Order Placed Successfully ");
	}


	@Override
	public void cancelOrder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter cancel for order cancel or no for continue");
		String choise = sc.next();
		if (choise.equalsIgnoreCase("cancel")) {
			System.out.println("Order canceled");
			System.out.println("Cancelation charges may applied");
		} else {
			System.out.println("Thankyou for chosing us");
		}
	}
}
