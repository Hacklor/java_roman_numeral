package com.philips.roman_numeral;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeral {

    private static final Map<String, Integer> ROMANS = new LinkedHashMap<>();
    {
        ROMANS.put("IV", 4);
        ROMANS.put("IX", 9);
        ROMANS.put("XL", 40);
        ROMANS.put("XC", 90);
        ROMANS.put("CD", 400);
        ROMANS.put("CM", 900);
        ROMANS.put("I", 1);
        ROMANS.put("V", 5);
        ROMANS.put("X", 10);
        ROMANS.put("L", 50);
        ROMANS.put("C", 100);
        ROMANS.put("D", 500);
        ROMANS.put("M", 1000);
    }

    public int toArabic(String roman) {
        if (roman == null)
            throw new IllegalArgumentException();

        if (roman.isEmpty())
            return 0;

        for (String key : ROMANS.keySet())
            if (roman.startsWith(key))
                return ROMANS.get(key) + toArabic(roman.substring(key.length()));

        throw new IllegalArgumentException();
    }
}
