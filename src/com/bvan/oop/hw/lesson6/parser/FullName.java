package com.bvan.oop.hw.lesson6.parser;

/**
 * @author bvanchuhov
 */
public class FullName {

    private final String name;
    private final String surname;

    public FullName(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
