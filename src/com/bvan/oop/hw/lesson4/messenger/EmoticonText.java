package com.bvan.oop.hw.lesson4.messenger;

/**
 * @author bvanchuhov
 */
public class EmoticonText implements Text {

    private final String emoticonName;

    public EmoticonText(String emoticonName) {
        this.emoticonName = emoticonName;
    }

    @Override
    public String getContent() {
        switch (emoticonName) {
            case "winking-face":
                return "\uD83D\uDE09";
            case "ghost":
                return "\uD83D\uDC7B";
            default:
                return "<unknown emoticon>";
        }
    }

    @Override
    public String toString() {
        return "EmoticonText{" +
                "emoticonName='" + emoticonName + '\'' +
                '}';
    }
}
