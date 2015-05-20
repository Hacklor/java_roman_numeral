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
        assertRoman(50, "L");
        assertRoman(100, "C");
        assertRoman(500, "D");
        assertRoman(1000, "M");
    }

    @Test
    public void additionsToArabic() {
        assertRoman(2, "II");
        assertRoman(3, "III");
        assertRoman(6, "VI");
        assertRoman(15, "XV");
        assertRoman(1050, "ML");
    }

    @Test
    public void subtractionsToArabic() {
        assertRoman(4, "IV");
    }

}
