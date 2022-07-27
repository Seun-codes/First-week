package org.example.model;

import lombok.Getter;
import lombok.Setter;
import org.example.Enums.Role;
import org.example.Interfaces.ProductServicesInterface;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Store implements ProductServicesInterface {
    private String name;
    private List<Staff> listOfStaff;
    private static List<Product> productList = new ArrayList<>();
    private Role roles;
    //private Product product;


    public Store(String name, Role roles) {
        this.name = name;
        this.roles = roles;
        //this.product = product;
    }

    public Store() {

    }



    public static  List<Product> getProductList() {
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