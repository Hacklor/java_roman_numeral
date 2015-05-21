package com.philips.roman_numeral;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralTest {

    private final RomanNumeral romanNumeral = new RomanNumeral();

    @Test(expected = IllegalArgumentException.class)
    public void throws_nothing() {
        romanNumeral.toArabic(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throws_illegal() {
        romanNumeral.toArabic("A");
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
    }

    @Test
    public void subtractionsToArabic() {
        assertRoman(4, "IV");
        assertRoman(9, "IX");
        assertRoman(40, "XL");
        assertRoman(90, "XC");
        assertRoman(400, "CD");
        assertRoman(900, "CM");
    }

    @Test
    public void handlesTimosBirthYear() {
        assertRoman(1968, "MCMLXVIII");
    }

    private void assertRoman(int expected, String roman) {
        assertEquals(expected, romanNumeral.toArabic(roman));
    }
}
