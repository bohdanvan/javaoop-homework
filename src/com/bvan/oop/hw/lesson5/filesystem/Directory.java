package com.bvan.oop.hw.lesson5.filesystem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Directory extends NamedFSItem {

    private final List<FSItem> items = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public Directory add(FSItem item) {
        items.add(item);
        return this;
    }

    /**
     * Algorithm:
     * (1) Try to add directory into the current directory.
     * (2) If the added directory is a parent for itself,
     * (2.1) remove this directory from the end of the list and
     * (2.2) throw an exception.
     */
    public Directory add(Directory directory) {
        items.add(directory); // (1)
        if (isParent(directory, directory)) { // (2)
            items.remove(items.size() - 1);   // (2.1)
            throw new IllegalArgumentException("cyclic dependency"); // (2.2)
        }
        return this;
    }

    private boolean isParent(Directory parent, Directory child) {
        for (FSItem parentItem : parent.items) {
            if (parentItem == child || (parentItem instanceof Directory && isParent((Directory) parentItem, child))) {
                return true;
            }
        }
        return false;
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
        return getName() + items;
    }
}
