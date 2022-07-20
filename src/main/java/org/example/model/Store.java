package org.example.model;

import org.example.Enums.Role;
import org.example.Interfaces.ProductServicesInterface;

import java.util.ArrayList;
import java.util.List;

public class Store implements ProductServicesInterface {
    private String name;
    private List<Staff> listOfStaff;
    private List<Product> productList = new ArrayList<>();
    private Role roles;
    //private Product product;

    public Store(String name, Role roles) {
        this.name = name;
        this.roles = roles;
        //this.product = product;
    }

    public Store() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Staff> getListOfStaff() {
        return listOfStaff;
    }

    public void setListOfStaff(List<Staff> listOfStaff) {
        this.listOfStaff = listOfStaff;
    }

    public List<Product> getProductList() {
        return productList;
    }


    public ArrayList  productCategories(String category){
        ArrayList<Product> productCategory = new ArrayList<>();
        for(Product products : this.getProductList()){
            if(products.getCategory().equalsIgnoreCase(category)){
                productCategory.add(products);

            }
        }
        return productCategory;

    }

    @Override
    public int findProduct(String name) {
        for(Product product1 : this.productList){
            if(product1.getName().equalsIgnoreCase(name)){
                return  this.productList.indexOf(product1);
            }
        }
        return -1;
    }
}