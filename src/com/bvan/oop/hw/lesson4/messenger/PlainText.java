package com.bvan.oop.hw.lesson4.messenger;

/**
 * @author bvanchuhov
 */
public class PlainText implements Text {

    private final String content;

    public PlainText(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "PlainText{" +
                "content='" + content + '\'' +
                '}';
    }
}
