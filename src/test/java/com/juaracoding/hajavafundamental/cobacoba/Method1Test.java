package com.juaracoding.hajavafundamental.cobacoba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class Method1Test {



    @Test
    void testMethodAreaOfRectangleShouldReturnCorrectResult() {
        var result = Method1.areaOfRectangle(2.0, 3.0);

        assertEquals(6.0, result, 0.0);
        assertInstanceOf(Double.class, result);
    }

    @Test
    void testMethodAreaOfCircleShouldReturnCorrectResult() {
        var result = Method1.areaOfCircle(12.0);

        assertEquals(Math.PI * Math.pow(12, 2), result, 0.0);
        assertInstanceOf(Double.class, result);
    }

    @Test
    void testMethodAreaOfKiteShouldReturnCorrectResult() {
        var result = Method1.areaOfKite(4.0, 3.0);

        assertEquals(6.0, result, 0.0);
        assertInstanceOf(Double.class, result);
    }
}