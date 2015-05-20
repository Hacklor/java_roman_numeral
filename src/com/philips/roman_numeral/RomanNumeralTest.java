package com.philips.roman_numeral;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralTest {
    private final RomanNumeral romanNumeral = new RomanNumeral();

    private void assertRoman(int expected, String roman) {
        assertEquals(expected, romanNumeral.toArabic(roman));
    }

    @Test
    public void emptyBecomesZero() {
        assertRoman(0, "");
    }

    @Test
    public void singleRomanNumeralToArabic() {
        assertRoman(1, "I");
        assertRoman(5, "V");
        assertRoman(10, "X");
    }

}
