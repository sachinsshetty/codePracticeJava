/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shetty.sachin.concurrentutils.joinfork.recursivetask;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author sachin
 */
public class SingleThreadTest {
    
    public SingleThreadTest() {
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
     * Test of execute method, of class SingleThread.
     */
    
    @Test
    public void testExecute() {
        System.out.println("execute");
        int size = 0;
        SingleThread instance = new SingleThread();
        double expResult = 2545;
        double result = instance.execute(size);
       // assertEquals(expResult, result, 0.0);
     }
    
}
