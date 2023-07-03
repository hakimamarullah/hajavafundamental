package com.juaracoding.hajavafundamental.cobacoba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramUpperLowerCaseTest {

    @Test
    void testIsDigitShouldReturnCorrectAnswer() {
        assertTrue(ProgramUpperLowerCase.isDigit('0'));
        assertTrue(ProgramUpperLowerCase.isDigit('1'));
        assertTrue(ProgramUpperLowerCase.isDigit('9'));

        // Negative
        assertFalse(ProgramUpperLowerCase.isDigit('a'));
        assertFalse(ProgramUpperLowerCase.isDigit('.'));
    }

    @Test
    void testIsHurufShouldReturnsCorrectAnswer() {
        assertTrue(ProgramUpperLowerCase.isHuruf('a'));
        assertTrue(ProgramUpperLowerCase.isHuruf('z'));
        assertTrue(ProgramUpperLowerCase.isHuruf('c'));
        assertTrue(ProgramUpperLowerCase.isHuruf('A'));
        assertTrue(ProgramUpperLowerCase.isHuruf('B'));
        assertTrue(ProgramUpperLowerCase.isHuruf('Z'));

        // Negative
        assertFalse(ProgramUpperLowerCase.isHuruf('1'));
        assertFalse(ProgramUpperLowerCase.isHuruf('9'));
        assertFalse(ProgramUpperLowerCase.isHuruf('%'));

    }

    @Test
    void testIsLowerCaseShouldReturnsCorrectAnswer() {
        assertTrue(ProgramUpperLowerCase.isLowerCase('a'));
        assertTrue(ProgramUpperLowerCase.isLowerCase('b'));
        assertTrue(ProgramUpperLowerCase.isLowerCase('z'));

        // Negative
        assertFalse(ProgramUpperLowerCase.isLowerCase('A'));
        assertFalse(ProgramUpperLowerCase.isLowerCase('B'));
        assertFalse(ProgramUpperLowerCase.isLowerCase('Z'));

        assertFalse(ProgramUpperLowerCase.isLowerCase('0'));
        assertFalse(ProgramUpperLowerCase.isLowerCase('/'));
        assertFalse(ProgramUpperLowerCase.isLowerCase('.'));


    }
}