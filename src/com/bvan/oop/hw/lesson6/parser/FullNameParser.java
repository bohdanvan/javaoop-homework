package com.bvan.oop.hw.lesson6.parser;

/**
 * @author bvanchuhov
 */
public interface FullNameParser {

    /**
     * Parses string into full name object.
     * First name and last name MUST contain only letters
     * AND start from upper case.
     *
     * @param s input string
     * @return parsed full name object
     * @throws IllegalFirstNameException occurs if first name is illegal
     * @throws IllegalLastNameException occurs if last name is illegal
     * @throws IllegalFullNameException occurs if can't parse by any other reason
     */
    FullName parse(String s);
}
