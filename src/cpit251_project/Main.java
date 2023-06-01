/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//lama alzahrani
package cpit251_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {
     private List<Product> productList=new ArrayList();
     private List<Cart> cartList=new ArrayList();
     Product p;
     Cart cart1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        Main main=new Main();
        Product prod=new Product(1,0.0,"acrylics");
        Product prod1=new Product(2,1.0,"oils");
        Product prod2=new Product(3,0.0,"watercolors");
        Product prod3=new Product(4,0.0,"pastels");
        main.productList.add(prod);
        main.productList.add(prod1);
        main.productList.add(prod2);
        main.productList.add(prod3);
        
        /////////////////////////////////////////////////////////////////////////
        showMenue();
        String x=input.next();
       // check input 
        while (!(x.charAt(0)=='1'||x.charAt(0)=='2')){
            System.out.println("wrong input try again");
            x=input.next();
        }
        
        System.out.println("sec");
         String i = null;
        do{
            
           
            switch(x){
                case "1":{
                     System.out.println("----------------Customer menue-------------------"
                                      + "\n1 for view products"
                                      + "\n2 to add to cart and view cart"
                                      + "\n3 search for product"
                                      + "\n4 place order"
                                      + "\no to exit"
                                      + "\n-----------------------------------------------");
                      
                     i=input.next();
                     
                     if(i.charAt(0)=='1'){
                         main.printAllProduct();
                     }
                     
                     else if(i.charAt(0)=='2'){
                       
                          String ex=null;
                         do{
                            
                         System.out.println("Enter type for item: "
                                          + "1 for acrylics, "
                                          + "2 for oils, "
                                          + "3 for watercolors, "
                                          + "4 for pastels");
                         String item=input.next();
                         if(item.charAt(0)=='1'){
                              
                            main.addToCart(prod.getType(),prod.getPrice());
                         }
                         else if(item.charAt(0)=='2'){
                              
                            main.addToCart(prod1.getType(), prod1.getPrice());
                         }
                         else if(item.charAt(0)=='3'){
                              
                            main.addToCart(prod2.getType(), prod2.getPrice());
                         }
                         else if(item.charAt(0)=='4'){
                              
                            main.addToCart(prod3.getType(), prod3.getPrice());
                         }
                        
                         
                         main.printCart();
                        // System.out.println("enter quantity");
                        // int quantity=input.nextInt();
                         
                        /////////// main.addToCart(item,quantity);
                       // main.printCart();
                             System.out.println("if you want exit cart enter 0");
                             ex=input.next();
                        }while(!(ex.charAt(0)=='0'));
                        
                         
                     }
                    
                     else if(i.charAt(0)=='3'){
                         System.out.println("Enter type of product: acrylics, oils, watercolors, pastels");
                         String type=input.next();
                         main.searchProduct(type);
                     }
                    
                     else if(i.charAt(0)=='4'){
                         main.printAllProduct();
                     }
                      
                    break;
                }
                 
                
                case "2":{
                 System.out.println("-----------------Artist menue----------------"
                                  + "\n1 for view product"
                                  + "\n2 to add new item"
                                  + "\n3 to remove item"
                                  + "\n0 exit"
                                  + "\n--------------------------------------------");
                     i=input.next();
                     if(i.charAt(0)=='1'){
                         main.printAllProduct();
                     }
                     else if(i.charAt(0)=='2'){
                         System.out.println("Enter product details:");
                         System.out.println("enter the type:");
                         String type=input.next();
                         System.out.println("enter the price:");
                         double price=input.nextDouble();
                         System.out.println("enter the id:");
                         int id=input.nextInt();
                         
                         Product prod4=new Product(id,price,type);
                         main.productList.add(prod4);
                         System.out.println("items:");
                         main.printAllProduct();
                         
                     }
                     else if(i.charAt(0)=='3'){
                         main.printAllProduct();
                         System.out.println("Enter product id to remove it ");
                        // int id=input.nextInt();
                        String t=input.next();
                         main.deleteProduct(t);
                         
                     }
                     
                    
                    break;
                }
                
            }
           
            System.out.println("000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        }while(!(i.charAt(0)=='0'));
        System.out.println("while end");
        
        
        
        
        main.printAllProduct();
        System.out.println("enter pro:");
        String n=input.next();
        main.searchProduct(n);
        
        
       // int user1=input.nextInt();
        
       //int p,n;
        
       
        
    }
   /** public void copy(String type){
        for( Product s:productList){
            if(s.getType()==type){
               System.out.println("information : "+ s.getType()+", "+s.getPrice()+", "+s.getId()+"");
                
               cart1=new Cart(s.getType(), 1,true,s.getPrice());
               cartList.add(cart1);
            }
        }
        
        printCart();
    }*/
    public void addToCart(String item, double price){
        cart1=new Cart(item, true,0.0);
        cartList.add(cart1);
                         System.out.println("");
                         System.out.println("item in cart ");
                         
    }
     public void printCart(){
         int quan=0;
         for(Cart s:cartList){
            System.out.println(", "+s.getType()+", "+s.price);
            quan++;
        }
         System.out.println("item number in the cart: "+quan);
    }
    public void deleteProduct(String t){
        
        for(Product s:productList){
            if(s.getType()==t){
               productList.remove(s);
                
            }
        }
        
        printAllProduct();
    }
    public void searchProduct(String type){
        
         for(Product s:productList){
             if (s.getType().equals(type)){
                 System.out.println("information : "+ s.getType()+", "+s.getPrice()+", "+s.getId()+"");
             }
         }
    }
     public void add(Product prod){
        productList.add(prod);
    }
    
     public void printAllProduct(){
        for(Product s:productList){
            System.out.println(""+s.getId()+", "+s.getPrice()+", "+s.getType());
        }
    }
    public static void showMenue(){
        System.out.println("****************************************************************************"
                         + "\n****************************************************************************"
                         + "\n                       Welcome to Artsy application                         "
                         + "\n****************************************************************************"
                         + "\n****************************************************************************"
                         + "\n"
                + "\npress (1) if you are a customer"
                + "\npress (2) if you are an artist");
    }
    
}
