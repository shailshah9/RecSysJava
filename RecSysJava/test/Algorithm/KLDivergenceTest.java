/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm;

import junit.framework.TestCase;

/**
 *
 * @author Shail Shah
 */
public class KLDivergenceTest extends TestCase {
    
    public KLDivergenceTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of klDivergence method, of class KLDivergence.
     */
    public void testKlDivergence() {
        System.out.println("klDivergence");
        double[] p1 = null;
        double[] p2 = null;
        double expResult = 0.0;
        double result = KLDivergence.klDivergence(p1, p2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
