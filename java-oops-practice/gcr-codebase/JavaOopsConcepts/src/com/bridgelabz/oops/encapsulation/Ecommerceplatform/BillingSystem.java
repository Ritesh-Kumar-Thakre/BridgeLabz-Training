package com.bridgelabz.oops.encapsulation.Ecommerceplatform;

public class BillingSystem {

    public static void printFinalBill(Product product) {

        product.displayProductDetails();

        double discount = product.calculateDiscount();
        double tax = 0;

        if(product instanceof Taxable taxableProduct) {
            tax = taxableProduct.calculateTax();
            System.out.println(taxableProduct.getTaxDetails());
        }

        double finalPrice = product.getPrice() + tax - discount;

        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("----------------------------------");
    }
}
