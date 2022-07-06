package org.example.model;

import java.util.Objects;

public class Product {

    private String category;
    private String name;
    private int quantity;

    private Double price;

    private int buyingQuantity;

    public Product(String category, String name, int quantity, Double price) {
        this.category = category;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Product(String category, String name, int quantity, double price, int buyingQuantity) {
        this.category = category;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.buyingQuantity = buyingQuantity;
    }




    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
   }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }


    public int getBuyingQuantity() {
      return buyingQuantity;
   }

  public void setBuyingQuantity(int buyingQuantity) {
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
