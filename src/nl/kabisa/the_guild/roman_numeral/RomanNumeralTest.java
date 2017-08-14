package nl.kabisa.the_guild.roman_numeral;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class RomanNumeralTest {

    @Test
    public void singleRomanNumeralToArabic() {
        assertEquals(1, toArabic("I"));
        assertEquals(5, toArabic("V"));
        assertEquals(10, toArabic("X"));
    }

    private static final Map<String, Integer> ROMAN_TO_ARABIC = romanToArabicMap();

    private static Map<String,Integer> romanToArabicMap() {
        Map<String, Integer> romanToArabic = new HashMap<>();

        romanToArabic.put("X", 10);
        romanToArabic.put("V", 5);
        romanToArabic.put("I", 1);

        return romanToArabic;
    }

    private int toArabic(String roman) {
        for (String romanDigit : ROMAN_TO_ARABIC.keySet())
            if (roman.equals(romanDigit))
                return ROMAN_TO_ARABIC.get(romanDigit);

        return 0;
    }
}
