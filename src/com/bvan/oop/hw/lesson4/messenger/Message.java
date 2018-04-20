package com.bvan.oop.hw.lesson4.messenger;

import java.time.LocalDateTime;

/**
 * @author bvanchuhov
 */
public class Message {

    private final String author;
    private final Text text;
    private final LocalDateTime publicationDate;

    public Message(String author, Text text, LocalDateTime time) {
        this.author = author;
        this.text = text;
        this.publicationDate = time;
    }

    public String show() {
        return text.getContent() + "\n" + "by " + author + ", " + publicationDate;
    }
}
