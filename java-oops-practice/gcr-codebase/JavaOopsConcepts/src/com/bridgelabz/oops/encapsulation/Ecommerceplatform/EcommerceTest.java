package com.bridgelabz.oops.encapsulation.Ecommerceplatform;

public class EcommerceTest {

    public static void main(String[] args) {

        Product p1 = new Electronics(101, "Laptop", 60000);
        Product p2 = new Clothing(102, "T-Shirt", 1500);
        Product p3 = new Groceries(103, "Rice Bag", 1200, 10);

        Product[] cart = { p1, p2, p3 };

        for(Product p : cart) {
            BillingSystem.printFinalBill(p);
        }
    }
}
