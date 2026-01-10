package day7.FoodLoop;

public class FoodLoopApp {
	public static void main(String[] args) {
		VegItem v1 = new VegItem("Poha", "Veg", 100, 10, 3);
		VegItem v2 = new VegItem("Staple grains", "Veg", 400, 6, 0);
		VegItem v3 = new VegItem("Lentils (dal)", "Veg", 500, 4, 0);
		VegItem v4 = new VegItem("Legumes ", "Veg", 200, 9, 0);

		NonVegItem n1 = new NonVegItem("Poultry", "Non-Veg", 600, 9, "Chicken");
		NonVegItem n2 = new NonVegItem("Red meat", "Non-Veg", 800, 5, "Mutton");
		NonVegItem n3 = new NonVegItem("Seafood", "Non-Veg", 645, 7, "Fish");
		NonVegItem n4 = new NonVegItem("Eggs", "Non-Veg", 200, 20, "Not a meat");

		Order order = new Order();
		order.items.add(v1);
		order.items.add(v2);
		order.items.add(v3);
		order.items.add(v4);
		order.items.add(n1);
		order.items.add(n2);
		order.items.add(v3);
		order.items.add(v4);

		order.orderItem.add(v1.name);
		order.orderItem.add(v2.name);
		order.contity.add(3);
		order.contity.add(4);
		order.orderPrice.add(v1.price);
		order.orderPrice.add(v2.price);
		
		order.orderItem.add(n1.name);
		order.orderItem.add(n2.name);
		order.contity.add(2);
		order.contity.add(3);
		order.orderPrice.add(n1.price);
		order.orderPrice.add(n2.price);
		
		order.applyDiscount(order.totalPrice());
		order.placeOrder();
		order.cancelOrder();
	}
}
