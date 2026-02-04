package com.day1.scenarios.ecommerce;

public class EcommerceSystem {
	public static void main(String[] args) {

		Product p1 = new Product("Wireless Earbuds", 15.0, "SAVE10", "TechZone", null, "BlueDart");
		Product p2 = new Product("T-shirt", null, null, null, "Premium cotton", null);

		// 1. Default discount
		System.out.println("1. Discount:");
		double disc = p1.getDiscountPercent().orElse(0.0);
		System.out.println(p1.getName() + " --> " + disc + "%");

		// 2. Coupon logic
		System.out.println("\n2. Coupon:");
		p1.getCouponCode().ifPresent(code -> System.out.println("Applying coupon: " + code));
		p2.getCouponCode().ifPresentOrElse(code -> System.out.println("Applying coupon: " + code),
				() -> System.out.println("No coupon available"));

		// 3. Seller details
		System.out.println("\n3. Seller:");
		String seller = p1.getSellerName().orElse("Marketplace Seller");
		System.out.println("Sold by: " + seller);

		// 4. Description fallback
		System.out.println("\n4. Description:");
		String desc = p1.getDescription().orElse("No description available");
		System.out.println(p1.getName() + " --> " + desc);

		// 5. Delivery partner
		System.out.println("\n5. Delivery:");
		p1.getDeliveryPartner().ifPresent(partner -> System.out.println("Delivered by: " + partner));
	}
}