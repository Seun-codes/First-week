package org.example.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
@Getter
@Setter
public class Product {

    private String category;
    private String name;
    private int quantity;

    private Double price;

    private int buyingQuantity;
    private List<Product> products = new ArrayList<>();
    private String boughtBy;
    private int positionInQueue;

    public Product(String category, String name, Double price, int buyingQuantity) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.buyingQuantity = buyingQuantity;
    }

    public Product(String category, String name, int quantity, double price) {
        this.category =category;
        this.name =name;
        this.quantity =quantity;
        this.price = price;
        this.buyingQuantity = buyingQuantity;
    }






    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return name == product.name && quantity == product.quantity && Double.compare(product.price, price) == 0 && category.equals(product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name, quantity, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }


}
