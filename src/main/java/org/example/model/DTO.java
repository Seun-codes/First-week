package org.example.model;





public class DTO {
    private String productName;
    private int quantity;
   private String customerName;

    public DTO(String productName, int quantity, String customerName) {
        this.productName = productName;
        this.quantity = quantity;
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "DTO{" +
                "productName='" + productName + '\'' +
                ", productQuantity=" + quantity +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}