package com.juaracoding.hajavafundamental.testharian.praktikum2;

import org.junit.Test;

import static com.juaracoding.hajavafundamental.testharian.praktikum2.Praktikum2.average;
import static org.junit.Assert.assertEquals;

public class Praktikum2Test {

    @Test
    public void testAverageMethodShouldReturnCorrectValue() {
        assertEquals(52.75, average(211, 4), 0.0);
        assertEquals(55.4, average(277, 5), 0.0);
        assertEquals(39.75, average(159, 4), 0.0);
    }
}