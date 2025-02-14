package edu.estatuas;

import static org.junit.Assert.*;

import org.junit.Test;


public class DniTest {

    @Test
    public void getDni() {
        String dni = "78484464T";

        assertEquals(dni, new Dni(dni).getDni());
    }

    public void getLetter() {
        String dni = "78484464T";
        assertEquals("T", new Dni(dni).getLetter());
    }

    public void getNumber() {
        String dni = "39492958A";
        assertEquals("39492958", new Dni(dni).getNumber());
    }

    public void validDni() {
        String[] validDnis = {
                "78484464T",
                "72376173A",
                "01817200Q",
                "95882054E",
                "63587725Q",
                "26861694V",
                "21616083Q",
                "26868974Y",
                "40135330P",
                "89044648X",
                "80117501Z",
                "34168723S",
                "76857238R",
                "66714505S",
                "66499420A"
        };

        for (String dni : validDnis) {
            assertTrue(new Dni(dni).isDniValid());
        }
    }

    public void invalidDni() {
        String[] invalidDnis = {
            "43770614Z",
            "109554436M",
            "315845952J",
            "828529506A",
            "925447738E",
            "32884726C",
            "506819213Z",
            "139981092V",
            "652673519L",
            "547628548I",
            "983419495R",
            "898273005H",
            "",
            "0123"
        };

        for (String dni: invalidDnis) {
            assertFalse(new Dni(dni).isDniValid());
        }
    }
}
