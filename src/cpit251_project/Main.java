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
     private List<Product> pro=new ArrayList();
     Product p;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        Main main=new Main();
        Product prod=new Product(0,0.0,"lona");
        Product prod1=new Product(0,0.0,"lona");
        Product prod2=new Product(0,0.0,"lona");
        Product prod3=new Product(0,0.0,"lama");
        main.pro.add(prod);
        main.pro.add(prod1);
        main.pro.add(prod2);
        main.pro.add(prod3);
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
                     System.out.println("Customer menue"
                    + "\n1 for view products"
                    + "\n2 to view cart"
                    + "\no to exit");
                      i=input.next();
                      
                    break;
                }
                 case "2":{
                 System.out.println("Artist menue"
                    + "\n1 for view product"
                    + "\n2 to exit");
                     i=input.next();
                     if(i.charAt(0)=='1'){
                         main.printAllProduct();
                     }
                    break;
                }
                
            }
           
            System.out.println("while");
        }while(!(i.charAt(0)=='0'));
        
        
        
        
        
        main.printAllProduct();
        System.out.println("enter pro:");
        String n=input.next();
        main.searchProduct(n);
        
        
        int user1=input.nextInt();
        
       //int p,n;
        
       
        
    }
    public void searchProduct(String type){
        
         for(Product s:pro){
             if (s.getType().equals(type)){
                 System.out.println("information : "+ s.getType()+", "+s.getPrice()+", "+s.getId()+"");
             }
         }
    }
     public void add(Product prod){
        pro.add(prod);
    }
    
     public void printAllProduct(){
        for(Product s:pro){
            System.out.println(""+s.getId()+", "+s.getPrice()+", "+s.getType());
        }
    }
    public static void showMenue(){
        System.out.println("****************************************************************************"
                         + "\n****************************************************************************"
                         + "\n                       Welcome to Artsy application                         "
                         + "\n****************************************************************************"
                         + "\n****************************************************************************"
                         + "\nwho are you"
                + "\npress (1) if you are a customer"
                + "\npress (2) if you are an artist");
    }
    
}
