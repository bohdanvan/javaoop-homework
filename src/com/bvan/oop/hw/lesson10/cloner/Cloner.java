package com.bvan.oop.hw.lesson10.cloner;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author bvanchuhov
 */
public class Cloner {

    /**
     * @throws CloningException
     */
    public <T> T clone(T value) {
        try {
            byte[] bytes = serialize(value);
            return deserialize(bytes);
        } catch (IOException | ClassNotFoundException e) {
            throw new CloningException("Can't clone value", e);
        }
    }

    private <T> byte[] serialize(T value) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream)) {
            outputStream.writeObject(value);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private <T> T deserialize(byte[] bytes) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new ByteArrayInputStream(bytes))) {
            return (T) inputStream.readObject();
        }
    }
}
