/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author cobra
 */
public class PrinterRepairmenTest {
    
    public PrinterRepairmenTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getName method, of class PrinterRepairmen.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        PrinterRepairmen instance = new PrinterRepairmen();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistance method, of class PrinterRepairmen.
     */
    @Test
    public void testGetDistance() {
        System.out.println("getDistance");
        PrinterRepairmen instance = new PrinterRepairmen();
        double expResult = 0.0;
        double result = instance.getDistance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDistance method, of class PrinterRepairmen.
     */
    @Test
    public void testSetDistance() {
        System.out.println("setDistance");
        double distance = 0.0;
        PrinterRepairmen instance = new PrinterRepairmen();
        instance.setDistance(distance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class PrinterRepairmen.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        PrinterRepairmen instance = new PrinterRepairmen();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class PrinterRepairmen.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        PrinterRepairmen instance = new PrinterRepairmen();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getX method, of class PrinterRepairmen.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        PrinterRepairmen instance = new PrinterRepairmen();
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class PrinterRepairmen.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        PrinterRepairmen instance = new PrinterRepairmen();
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getXpos method, of class PrinterRepairmen.
     */
    @Test
    public void testGetXpos() {
        System.out.println("getXpos");
        PrinterRepairmen instance = new PrinterRepairmen();
        int expResult = 0;
        int result = instance.getXpos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYpos method, of class PrinterRepairmen.
     */
    @Test
    public void testGetYpos() {
        System.out.println("getYpos");
        PrinterRepairmen instance = new PrinterRepairmen();
        int expResult = 0;
        int result = instance.getYpos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalcDistance method, of class PrinterRepairmen.
     */
    @Test
    public void testCalcDistance() {
        System.out.println("CalcDistance");
        PrinterRepairmen instance = new PrinterRepairmen();
        instance.CalcDistance();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalcPrise method, of class PrinterRepairmen.
     */
    @Test
    public void testCalcPrise() {
        System.out.println("CalcPrise");
        PrinterRepairmen instance = new PrinterRepairmen();
        instance.CalcPrise();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
