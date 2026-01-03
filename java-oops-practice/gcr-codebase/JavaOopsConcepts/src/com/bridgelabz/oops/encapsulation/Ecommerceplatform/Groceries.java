package com.bridgelabz.oops.encapsulation.Ecommerceplatform;

public class Groceries extends Product {

    public Groceries(int id, String name, double price, double weightKg) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;   // 5% discount
    }
}
