/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Equipo
 */
public class GastoTest {
    
    public GastoTest() {
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

    @Test(expected = IllegalArgumentException.class)
    public void ConstructorTest() {
        
        String gGasto = null;
        String gDescripcion = null;
        String gCategoria = null;
        String gMes = null;
        String gAno = null;
        
        
        Gasto g = new Gasto(gGasto, gDescripcion, gCategoria, gMes, gAno);
    }
}
