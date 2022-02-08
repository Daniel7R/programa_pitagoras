/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_pitagoras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 312C-15
 */
public class pitagorasIT {
    
    public pitagorasIT() {
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
     * Test of calcular_hipotenusa method, of class pitagoras.
     */
    @Test
    public void testCalcular_hipotenusa() {
        System.out.println("calcular_hipotenusa");
        double a = 6;
        double b = 8;
        double expResult = 0.0;
        double result = pitagoras.calcular_hipotenusa(a, b);
        assertEquals(expResult, result, 10);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
