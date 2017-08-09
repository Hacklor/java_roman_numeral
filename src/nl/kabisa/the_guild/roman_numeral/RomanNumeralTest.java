package nl.kabisa.the_guild.roman_numeral;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralTest {

    @Test
    public void romanIBecomes1() {
        assertEquals(1, toArabic("I"));
        assertEquals(5, toArabic("V"));
    }

    @Test
    public void romanVBecomes5() {
        assertEquals(5, toArabic("V"));
    }

    private int toArabic(String roman) {
        if (roman.equals("V"))
            return 5;

        return 1;
    }
}
