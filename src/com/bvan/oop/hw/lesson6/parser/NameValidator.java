package com.bvan.oop.hw.lesson6.parser;

/**
 * @author bvanchuhov
 */
public class NameValidator {

    public boolean isName(String s) {
        if (s.isEmpty()) {
            return false;
        }
        char firstLetter = s.charAt(0);
        if (!Character.isAlphabetic(firstLetter) || !Character.isUpperCase(firstLetter)) {
            return false;
        }

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isAlphabetic(ch) || !Character.isLowerCase(ch)) {
                return false;
            }
        }
        return true;
    }
}
