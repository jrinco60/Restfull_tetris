/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jean.rincon
 */
public class OperarTest {

    public OperarTest() {
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
     * Test of colideFicha method, of class Operar.
     */
    @Test
    public void testColideFicha() {
        System.out.println("colideFicha");
        String[][] Board = {
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "O", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "O", " ", " ", " ", " "},
            {" ", " ", " ", " ", "O", "O", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"X", "X", "X", "X", "X", "X", "X", "X", "X", "X"}
        };
        Operar instance = new Operar();
        String[][] expResult = {
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "X", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "X", " ", " ", " ", " "},
            {" ", " ", " ", " ", "X", "X", " ", " ", " ", " "},
            {" ", " ", " ", " ", "X", "X", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"X", "X", "X", "X", "X", "X", "X", "X", "X", "X"}
        };
        String[][] result = instance.colideFicha(Board);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of dibujar method, of class Operar.
     */
    @Test
    public void testDibujar() {
        System.out.println("dibujar");
        String[][] Board = {
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "X", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "X", " ", " ", " ", " "},
            {" ", " ", " ", " ", "X", "X", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"X", "X", "X", "X", "X", "X", "X", "X", "X", "X"}
        };
        Operar instance = new Operar();
        instance.dibujar(Board);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiar method, of class Operar.
     */
    @Test
    public void testLimpiar() {
        System.out.println("limpiar");
        String[][] Board = {
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "O", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "O", " ", " ", " ", " "},
            {" ", " ", " ", " ", "O", "O", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"X", "X", "X", "X", "X", "X", "X", "X", "X", "X"}
        };
        Operar instance = new Operar();
        String[][] expResult = {
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"X", "X", "X", "X", "X", "X", "X", "X", "X", "X"}
        };
        String[][] result = instance.limpiar(Board);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of isBajar method, of class Operar.
     */
    @Test
    public void testIsBajar() {
        System.out.println("isBajar");
        Operar instance = new Operar();
        boolean expResult = false;
        boolean result = instance.isBajar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setBajar method, of class Operar.
     */
    @Test
    public void testSetBajar() {
        System.out.println("setBajar");
        boolean bajar = false;
        Operar instance = new Operar();
        instance.setBajar(bajar);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of bajar method, of class Operar.
     */
    @Test
    public void testBajar() {
        System.out.println("bajar");
        String[][] Board = {
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"X", "X", "X", "X", "X", "X", "X", "X", "X", "X"}
        };
        String[][] ficha = {
            {null, "0,5", null, null},
            {null, "1,5", null, null},
            {"2,4", "2,5", null, null}
        };
        int b = 1;
        Operar instance = new Operar();
        String[][] expResult = {
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "O", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "O", " ", " ", " ", " "},
            {" ", " ", " ", " ", "O", "O", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"X", "X", "X", "X", "X", "X", "X", "X", "X", "X"}
        };
        String[][] result = instance.bajar(Board, ficha, b);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarLinea method, of class Operar.
     */
    @Test
    public void testEliminarLinea() {
        System.out.println("eliminarLinea");
        String[][] Board = {
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "O", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "O", " ", " ", " ", " "},
            {" ", " ", " ", " ", "O", "O", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"X", "X", "X", "X", "X", "X", "X", "X", "X", "X"}
        };
        Operar instance = new Operar();
        String[][] expResult = {
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "O", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", "O", " ", " ", " ", " "},
            {" ", " ", " ", " ", "O", "O", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
            {"X", "X", "X", "X", "X", "X", "X", "X", "X", "X"}
        };
        String[][] result = instance.eliminarLinea(Board);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of traerFicha method, of class Operar.
     */
    @Test
    public void testTraerFicha() {
        System.out.println("traerFicha");
        String orden = "traer";
        Operar instance = new Operar();
        String[][] expResult = {
            {null, "0,5", null, null},
            {null, "1,5", null, null},
            {"2,4", "2,5", null, null},
            {null, null, null, null}
        };
        String[][] result = instance.traerFicha(orden);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of convertirFicha method, of class Operar.
     */
    @Test
    public void testConvertirFicha() {
        System.out.println("convertirFicha");
        String resultado = "X-0,5-X-X/X-1,5-X-X/2,4-2,5-X-X/X-X-X-X";
        Operar instance = new Operar();
        String[][] expResult = {
            {null, "0,5", null, null},
            {null, "1,5", null, null},
            {"2,4", "2,5", null, null},
            {null, null, null, null}
        };
        String[][] result = instance.convertirFicha(resultado);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
