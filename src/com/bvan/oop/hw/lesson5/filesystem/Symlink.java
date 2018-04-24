package com.bvan.oop.hw.lesson5.filesystem;

/**
 * @author bvanchuhov
 */
public class Symlink implements FSItem {

    private String symlinkName;
    private final FSItem item;

    public Symlink(String symlinkName, FSItem item) {
        this.symlinkName = symlinkName;
        this.item = item;
    }

    @Override
    public String getName() {
        return symlinkName + " -> " + item.getName();
    }

    @Override
    public int getSize() {
        return 1;
    }


    @Override
    public String toString() {
        return getName();
    }
}
