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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        Main main=new Main();
        Product prod=new Product(0,0.0,"lona");
        main.pro.add(prod);
        main.print();
        showMenue();
        
        int user1=input.nextInt();
        
       //int p,n;
        
       
        
    }
     public void add(Product prod){
        pro.add(prod);
    }
    
     public void print(){
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
