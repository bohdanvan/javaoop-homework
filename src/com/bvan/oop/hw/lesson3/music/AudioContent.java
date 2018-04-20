package com.bvan.oop.hw.lesson3.music;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class AudioContent {

    private final byte[] content;

    public AudioContent(byte[] content) {
        this.content = content;
    }

    public byte[] getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "AudioContent{" +
                "content=" + Arrays.toString(content) +
                '}';
    }
}
