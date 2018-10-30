package com.bvan.oop.hw.lesson6.parser;

/**
 * @author bvanchuhov
 */
public class FullNameParserImpl implements FullNameParser {

    private final NameValidator validator = new NameValidator();

    /**
     * @throws IllegalFirstNameException
     * @throws IllegalLastNameException
     * @throws IllegalFullNameException
     */
    public FullName parse(String s) {
        String[] tokens = s.trim().split(" ");
        if (tokens.length < 2) {
            throw new IllegalFullNameException("missing space");
        }
        if (tokens.length > 2) {
            throw new IllegalFullNameException("too much spaces");
        }

        String firstName = tokens[0];
        if (!validator.isName(firstName)) {
            throw new IllegalFirstNameException();
        }

        String lastName = tokens[1];
        if (!validator.isName(lastName)) {
            throw new IllegalLastNameException();
        }

        return new FullName(firstName, lastName);
    }
}
