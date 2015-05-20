package com.philips.roman_numeral;

public class RomanNumeral {

    public int toArabic(String roman) {
        if (roman.equals("I"))
            return 1;

        if (roman.equals("V"))
            return 5;

        return 0;
    }
}
