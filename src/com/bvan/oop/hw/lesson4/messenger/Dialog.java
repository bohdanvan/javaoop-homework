package com.bvan.oop.hw.lesson4.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class Dialog {

    private final List<Message> messages = new ArrayList<>();

    public void addMessage(Message message) {
        messages.add(message);
    }

    public String show() {
        StringJoiner joiner = new StringJoiner("\n");
        for (Message message : messages) {
            joiner.add(message.show() + "\n");
        }
        return joiner.toString();
    }
}
