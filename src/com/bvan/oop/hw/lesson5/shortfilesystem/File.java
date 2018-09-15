package com.bvan.oop.hw.lesson5.shortfilesystem;

/**
 * @author bvanchuhov
 */
public class File extends FSItem {

    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public void setSize(int size) {
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
