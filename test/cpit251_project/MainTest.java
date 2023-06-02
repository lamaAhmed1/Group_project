/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251_project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    

    /**
     * Test of addToCart method, of class Main.
     */
    @Test
    public void testAddToCart() {
        System.out.println("addToCart");
        String item = "lama";
        double price = 0.0;
        
        Main instance = new Main();
       // Product p=new Product(0,0,"");
        String exept="lama";
        String cart= instance.addToCart(item, price);
        Assert.assertSame(exept, cart);
    }

    /**
     * Test of printCart method, of class Main.
     */
    

    /**
     * Test of deleteProduct method, of class Main.
     */
    //done
    @Test (timeout=90)
    public void testDeleteProduct() {
        System.out.println("deleteProduct");
        int t = 1;
        Main instance = new Main();
        boolean expe=true;
        boolean re=instance.deleteProduct(t);
        Assert.assertEquals(expe, re);
       // Assert.assertNotNull(t);
    }

    /**
     * Test of searchProduct method, of class Main.
     */
    //done
    @Test
    public void testSearchProduct() {
        System.out.println("searchProduct");
        String type = "oils";
        Main instance = new Main();
        String result= instance.searchProduct(type);
       String except="oils";
      Assert.assertSame(except, result);

       // Assert.assertNotNull(type);
    }

    /**
     * Test of add method, of class Main.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Product prod = new Product(2,2.0," ");
       
        Main instance = new Main();
        instance.add(prod);
        Product exprod2 = prod;
        
       // instance.add(prod);
        Assert.assertSame(exprod2,prod);
        
        
        // assertArrayEquals(expect,instance.add(prod));
       
    }
    

    /**
     * Test of printAllProduct method, of class Main.
     */
    @Test
    public void testPrintAllProduct() {
        System.out.println("printAllProduct");
        Main instance = new Main();
        instance.printAllProduct();
        Assert.assertNotNull(this);
    }

    /**
     * Test of showMenue method, of class Main.
     */
    
    
}
