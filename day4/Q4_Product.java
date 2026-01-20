package com.training.day4;

public class Q4_Product {
	int productId;
    String productName;
    double productPrice;

    public Q4_Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return productName + " (" + productPrice + " ₹)";
    }

}
