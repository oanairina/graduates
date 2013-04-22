/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import junit.framework.TestCase;

/**
 *
 * @author ocapatina
 */
public class MyLoginProxyTest extends TestCase {
    
    public MyLoginProxyTest(String testName) {
        super(testName);
    }

    /**
     * Test of isSucceeded method, of class MyLoginProxy.
     */
    public void testIsSucceeded() {
        System.out.println("isSucceeded");
        MyLoginProxy instance = null;
        boolean expResult = false;
        boolean result = instance.isSucceeded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of enterShop method, of class MyLoginProxy.
     */
    public void testEnterShop() {
        System.out.println("enterShop");
        MyLoginProxy instance = null;
        instance.enterShop();
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }
}
