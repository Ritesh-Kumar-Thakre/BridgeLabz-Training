package com.day1.scenarios.ecommerce;

import java.util.Optional;

public class Product {
	private String name;
	private Double discountPercent;
	private String couponCode;
	private String sellerName;
	private String description;
	private String deliveryPartner;

	public Product(String name, Double discountPercent, String couponCode, String sellerName, String description,
			String deliveryPartner) {
		this.name = name;
		this.discountPercent = discountPercent;
		this.couponCode = couponCode;
		this.sellerName = sellerName;
		this.description = description;
		this.deliveryPartner = deliveryPartner;
	}

	public Optional<Double> getDiscountPercent() {
		return Optional.ofNullable(discountPercent);
	}

	public Optional<String> getCouponCode() {
		return Optional.ofNullable(couponCode);
	}

	public Optional<String> getSellerName() {
		return Optional.ofNullable(sellerName);
	}

	public Optional<String> getDescription() {
		return Optional.ofNullable(description);
	}

	public Optional<String> getDeliveryPartner() {
		return Optional.ofNullable(deliveryPartner);
	}

	public String getName() {
		return name;
	}
}
