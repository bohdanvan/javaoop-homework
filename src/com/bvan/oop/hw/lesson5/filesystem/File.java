package com.bvan.oop.hw.lesson5.filesystem;

/**
 * @author bvanchuhov
 */
public class File extends NamedFSItem {

    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return getName() + "(" + size + ")";
    }
}
