package com.bvan.oop.hw.lesson5.shortfilesystem;

/**
 * @author bvanchuhov
 */
public abstract class FSItem {

    private String name;

    public FSItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract int getSize();
}
