/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251_project;

/**
 *
 * @author lenovo
 */
public class Product {
    int id;
    double price;
    String type;
   
    
     public Product(int id, double price, String type) {
        this.id = id;
        this.price = price;
        this.type = type;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
