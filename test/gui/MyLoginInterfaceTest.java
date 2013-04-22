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
public class MyLoginInterfaceTest extends TestCase {
    
    public MyLoginInterfaceTest(String testName) {
        super(testName);
    }

    /**
     * Test of enterShop method, of class MyLoginInterface.
     */
    public void testEnterShop() {
        System.out.println("enterShop");
        MyLoginInterface instance = new MyLoginInterfaceImpl();
        instance.enterShop();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    public class MyLoginInterfaceImpl implements MyLoginInterface {

        public void enterShop() {
        }
    }
}
