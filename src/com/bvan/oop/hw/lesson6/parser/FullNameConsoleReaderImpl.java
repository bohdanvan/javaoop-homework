package com.bvan.oop.hw.lesson6.parser;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class FullNameConsoleReaderImpl implements FullNameConsoleReader {

    private final FullNameParser parser = new FullNameParserImpl();

    @Override
    public FullName read() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter full name: ");
            String s = scanner.nextLine();

            try {
                return parser.parse(s);
            } catch (IllegalFirstNameException e) {
                System.out.println("Sorry, first name is illegal. Try again");
            } catch (IllegalLastNameException e) {
                System.out.println("Sorry, last name is illegal. Try again");
            } catch (IllegalFullNameException e) {
                System.out.println("Sorry, full name is illegal (" + e.getMessage() + "). Try again");
            }
        }
    }
}
