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
        assertEquals(50, toArabic("L"));
        assertEquals(100, toArabic("C"));
        assertEquals(500, toArabic("D"));
        assertEquals(1000, toArabic("M"));
    }

    @Test
    public void addMultipleRomanDigits() {
        assertEquals(2, toArabic("II"));
    }

    private static final Map<String, Integer> ROMAN_TO_ARABIC = romanToArabicMap();

    private static Map<String,Integer> romanToArabicMap() {
        Map<String, Integer> romanToArabic = new HashMap<>();


        romanToArabic.put("I", 1);
        romanToArabic.put("V", 5);
        romanToArabic.put("X", 10);
        romanToArabic.put("L", 50);
        romanToArabic.put("C", 100);
        romanToArabic.put("D", 500);
        romanToArabic.put("M", 1000);

        return romanToArabic;
    }

    private int toArabic(String roman) {
        for (String romanDigit : ROMAN_TO_ARABIC.keySet())
            if (roman.startsWith(romanDigit))
                return ROMAN_TO_ARABIC.get(romanDigit) + toArabic(roman.substring(1));

        return 0;
    }
}
