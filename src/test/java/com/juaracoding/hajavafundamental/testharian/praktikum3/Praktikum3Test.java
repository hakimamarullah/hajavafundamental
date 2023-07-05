package com.juaracoding.hajavafundamental.testharian.praktikum3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

class Praktikum3Test {

    @Test
    void testAverageListShouldReturnCorrectAnswer() {
        assertEquals(52.75, Praktikum3.averageList(Arrays.asList(15,2,4,190)), 0.0);
        assertEquals(55.4, Praktikum3.averageList(Arrays.asList(12,6,8,90,161)), 0.0);
    }

    @Test
    void testFormatListStringShouldReturnCorrectValue() {
        assertEquals("15, 2, 4 dan 190", Praktikum3.formatListString(Arrays.asList(15,2,4,190)));
        assertEquals("1 dan 2", Praktikum3.formatListString(Arrays.asList(1,2)));
        assertEquals("1, 2 dan 3", Praktikum3.formatListString(Arrays.asList(1,2,3)));
        assertEquals("1", Praktikum3.formatListString(List.of(1)));
    }
}