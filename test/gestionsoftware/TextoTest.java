/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionsoftware;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo-G40
 */
public class TextoTest {
    
    public TextoTest() {
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
     * Test of NumeroDeCaracteresConEspacios method, of class Texto.
     */
    @Test
    public void testNumeroDeCaracteresConEspacios() {
        System.out.println("NumeroDeCaracteresConEspacios");
        Texto instance = new Texto();
        instance.setTexto("hola mundo");
        int expResult = 10;
        int result = instance.NumeroDeCaracteresConEspacios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult) {
            fail("The test case is a prototype.");
        }else {
            System.out.println("Prueba acertada");
        }
    }
    
    
    /**
     * Test of NumeroDeCaracteresSinEspacios method, of class Texto.
     */
    @Test
    public void testNumeroDeCaracteresSinEspacios() {
        System.out.println("NumeroDeCaracteresSinEspacios");
        Texto instance = new Texto();
        instance.setTexto("hola mundo");
        int expResult = 9;
        int result = instance.NumeroDeCaracteresSinEspacios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result != expResult) {
            fail("The test case is a prototype.");
        }else {
            System.out.println("Prueba acertada");
        }
    }

}
