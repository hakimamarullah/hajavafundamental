package com.juaracoding.hajavafundamental.testharian.praktikum1;

import static com.juaracoding.hajavafundamental.testharian.praktikum1.Praktikum1.sumNonLowerCaseAscii;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class Praktikum1Test {

    @Test
    public void testSumAsciiShouldReturnCorrectResult() {
        String test1 = "Jquery 1995@v1.0";
        String test2 = "Bebas Lepas@";
        String test3 = "Tid4k $@ma";

        assertEquals(sumNonLowerCaseAscii(test1), 529);
        assertEquals(sumNonLowerCaseAscii(test2), 238);
        assertEquals(sumNonLowerCaseAscii(test3), 268);
    }
}