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
      List<Product> stud=new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        showMenue();
        
        int user1=input.nextInt();
      
        while(user1!=1 || user1!=2){
           System.out.println("wrong input, please try again");
           String x=input.nextLine();
           char i=x.charAt(0);
           if(x=="2"||x=="1"){
               break;
              
           }
           
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
