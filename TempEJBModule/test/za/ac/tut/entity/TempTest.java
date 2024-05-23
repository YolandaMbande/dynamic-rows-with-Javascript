/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package za.ac.tut.entity;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yolan
 */
public class TempTest {
    
    public TempTest() {
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
     * Test of getName method, of class Temp.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Temp instance = new Temp();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Temp.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Temp instance = new Temp();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class Temp.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Temp instance = new Temp();
        byte[] expResult = null;
        byte[] result = instance.getImage();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImage method, of class Temp.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        byte[] image = null;
        Temp instance = new Temp();
        instance.setImage(image);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTamp method, of class Temp.
     */
    @Test
    public void testGetTamp() {
        System.out.println("getTamp");
        Temp instance = new Temp();
        List<tamp> expResult = null;
        List<tamp> result = instance.getTamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTamp method, of class Temp.
     */
    @Test
    public void testSetTamp() {
        System.out.println("setTamp");
        List<tamp> tamp = null;
        Temp instance = new Temp();
        instance.setTamp(tamp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Temp.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Temp instance = new Temp();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Temp.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Temp instance = new Temp();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Temp.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Temp instance = new Temp();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Temp.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Temp instance = new Temp();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Temp.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Temp instance = new Temp();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
