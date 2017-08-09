package nl.kabisa.the_guild.roman_numeral;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralTest {

    @Test
    public void romanIBecomes1() {
        assertEquals(1, toArabic("I"));
    }

    private int toArabic(String roman) {
        return 1;
    }
}
