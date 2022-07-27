package org.example.model;


import lombok.Getter;

@Getter
public class DTO {
    private String productName;
    private int quantity;
   private String customerName;

    public DTO(String productName, int quantity, String customerName) {
        this.productName = productName;
        this.quantity = quantity;
        this.customerName = customerName;
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