package edu.estatuas;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.BeforeClass;

public class TablaAsignacionTest {

    private static TablaAsignacion tabla;

    @BeforeClass
    public static void crearTabla() {
        tabla = new TablaAsignacion();
    }

    @Test
    public void getTableIsNotNull() {
        assertNotNull(tabla.getTable());
    }

    @Test
    public void getLetterFromPosition() {
        assertEquals('T', tabla.getLetterFromPositionTable(0));
        assertEquals('E', tabla.getLetterFromPositionTable(22));
    }

    @Test
    public void calculateLetter() {
        char letter = tabla.calculateLetter("77422360");
        assertEquals('J', letter);
    }

    @Test
    public void getEveryLetterFromPosition() {
        for (int i = 0; i < tabla.getTable().length; i++) {
            char letter = tabla.getLetterFromPositionTable(i);
            assertTrue(Character.isLetter(letter));
        }
    }
}
