/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd3314.buildit5.pkg2015f;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0587637
 */
public class CPD3314BuildIt52015FTest {
    
    public CPD3314BuildIt52015FTest() {
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
     * Test of addTwo method, of class CPD3314BuildIt52015F.
     */
    @Test
    public void testAddTwo() {
        System.out.println("addTwo");
        int x = 0;
        int expResult = 2;
        int result = CPD3314BuildIt52015F.addTwo(x);
        assertEquals(expResult, result);
    }

    /**
     * Test of sphereArea method, of class CPD3314BuildIt52015F.
     */
    @Test
    public void testSphereArea() {
        System.out.println("sphereArea");
        double radius = 1.0;
        double expResult = 12.56636;
        double result = CPD3314BuildIt52015F.sphereArea(radius);
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of cylinderArea method, of class CPD3314BuildIt52015F.
     */
    @Test
    public void testCylinderArea() {
        System.out.println("cylinderArea");
        double r = 1.0;
        double h = 1.0;
        double expResult = 12.56636;
        double result = CPD3314BuildIt52015F.cylinderArea(r, h);
        assertEquals(expResult, result, 0.0001);
    }
    
}
