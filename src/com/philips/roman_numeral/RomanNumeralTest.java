package com.philips.roman_numeral;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralTest {
    private final RomanNumeral romanNumeral = new RomanNumeral();

    @Test
    public void emptyBecomesZero() {
        assertEquals(0, romanNumeral.toArabic(""));
    }

    @Test
    public void iBecomes1() {
        assertEquals(1, romanNumeral.toArabic("I"));
    }
}
