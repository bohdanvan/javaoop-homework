package com.bvan.oop.hw.lesson6.parser;

/**
 * @author bvanchuhov
 */
public class FullNameParserImpl implements FullNameParser {

    /**
     * @throws IllegalFirstNameException
     * @throws IllegalLastNameException
     * @throws IllegalFullNameException
     */
    public FullName parse(String s) {
        String[] tokens = s.split(" ");
        if (tokens.length < 2) {
            throw new IllegalFullNameException("missing space");
        }
        if (tokens.length > 2) {
            throw new IllegalFullNameException("to much spaces");
        }

        String firstName = tokens[0].trim();
        if (!isName(firstName)) {
            throw new IllegalFirstNameException();
        }

        String lastName = tokens[1].trim();
        if (!isName(lastName)) {
            throw new IllegalLastNameException();
        }

        return new FullName(firstName, lastName);
    }

    private boolean isName(String s) {
        if (s.isEmpty()) {
            return false;
        }
        char firstLetter = s.charAt(0);
        if (!Character.isAlphabetic(firstLetter) || !Character.isUpperCase(firstLetter)) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isAlphabetic(ch)) {
                return false;
            }
        }
        return true;
    }
}
