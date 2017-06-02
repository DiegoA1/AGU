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
public class PerfilTest {
    
    public PerfilTest() {
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
        
        String pUsuario = null;
        String pEdad = null;
        String pOcupacion = null;
        String pCiudad = null;
        String pCorreo = null;
        
        
        Perfil p = new Perfil(pUsuario, pEdad, pOcupacion, pCiudad, pCorreo);
    }
}
