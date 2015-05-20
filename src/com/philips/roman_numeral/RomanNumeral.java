package com.philips.roman_numeral;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private static final Map<String, Integer> ROMANS = new HashMap<>();
    {
        ROMANS.put("I", 1);
        ROMANS.put("V", 5);
        ROMANS.put("X", 10);
        ROMANS.put("L", 50);
        ROMANS.put("C", 100);
        ROMANS.put("D", 500);
        ROMANS.put("M", 1000);
    }

    public int toArabic(String roman) {
        for (String key : ROMANS.keySet())
            if (roman.equals(key))
                return ROMANS.get(key);

        return 0;
    }
}
