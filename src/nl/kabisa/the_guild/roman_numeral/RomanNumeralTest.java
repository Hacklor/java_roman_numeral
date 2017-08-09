package nl.kabisa.the_guild.roman_numeral;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralTest {

    @Test
    public void singleRomanNumeralToArabic() {
        assertEquals(1, toArabic("I"));
        assertEquals(5, toArabic("V"));
        assertEquals(10, toArabic("X"));
    }

    private int toArabic(String roman) {
        if (roman.equals("V"))
            return 5;

        return 1;
    }
}
