package com.bvan.oop.hw.lesson5.shortfilesystem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Directory extends FSItem {

    private final List<FSItem> items = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public Directory add(FSItem item) {
        items.add(item);
        return this;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FSItem item : items) {
            size += item.getSize();
        }
        return size;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "items=" + items +
                '}';
    }
}
