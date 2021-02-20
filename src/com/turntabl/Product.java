package com.turntabl;

public abstract class Product {
    private String productId;

    public Product(String productId) {

        this.productId = productId;

    }

    public String getProductId() {
        return productId;
    }

    public abstract double getCurrentPrice(ProductPricingService priceService);
}
