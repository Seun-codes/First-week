package org.example.model;

import java.util.List;
import java.util.Objects;

public class Product {

    private String productName;
    private int productQuantity;

    public Product(String productName, int productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return productQuantity == product.productQuantity && productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productQuantity);
    }
}
