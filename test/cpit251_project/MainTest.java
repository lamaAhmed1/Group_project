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
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printcus method, of class Main.
     */
    @Test
    public void testPrintcus() {
        System.out.println("printcus");
        Main instance = new Main();
        instance.printcus();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of placeOrder method, of class Main.
     */
    //DONE
    @Test
    public void testPlaceOrder() {
        System.out.println("placeOrder");
        String item = "";
        Main instance = new Main();
        instance.placeOrder(item);
        Assert.assertNotNull(item);
    }

    /**
     * Test of printorder method, of class Main.
     */
    @Test
    public void testPrintorder() {
        System.out.println("printorder");
        Main instance = new Main();
        instance.printorder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToCart method, of class Main.
     */
    //DONE
    @Test
    public void testAddToCart() {
        System.out.println("addToCart");
        String item = "lama";
        double price = 1.0;
        Main instance = new Main();
        String expResult = "lama";
        String result = instance.addToCart(item, price);
        assertEquals(expResult, result);
        Assert.assertNotNull(item,price);//extra
        
    }

    /**
     * Test of printCart method, of class Main.
     */
    @Test
    public void testPrintCart() {
        System.out.println("printCart");
        Main instance = new Main();
        instance.printCart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteProduct method, of class Main.
     */
    @Test
    public void testDeleteProduct() {
        System.out.println("deleteProduct");
        String t = "";
        Main instance = new Main();
        instance.deleteProduct(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchProduct method, of class Main.
     */
    /////DONE
    @Test
    public void testSearchProduct() {
        System.out.println("searchProduct");
        String type = "lama";
        Main instance = new Main();
        String expResult = "lama";
        String result = instance.searchProduct(type);
        assertEquals(expResult, result);
        Assert.assertNotNull(result);// extra
        
    }

    /**
     * Test of addItem method, of class Main.
     */
    //DONE
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        Product prod = new Product("1",0.0,"lama");
        Main instance = new Main();
        instance.addItem(prod);
        Product expecteds=prod;
        Assert.assertSame(expecteds, prod);
    }

    /**
     * Test of printAllProduct method, of class Main.
     */
    @Test
    public void testPrintAllProduct() {
        System.out.println("printAllProduct");
        Main instance = new Main();
        instance.printAllProduct();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showMenue method, of class Main.
     */
  
    
}
