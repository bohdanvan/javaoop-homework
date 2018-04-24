package com.bvan.oop.hw.lesson7.taskmanager;

import java.util.Comparator;

/**
 * @author bvanchuhov
 */
public class TaskComparators {

    /**
     * Alphabetical order.
     */
    public static Comparator<Task> byName() {
        return new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return t1.getName().compareTo(t2.getName());
            }
        };
    }

    public static Comparator<Task> byDeadline() {
        return new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return t1.getDeadline().compareTo(t2.getDeadline());
            }
        };
    }

    /**
     * From major to minor priority.
     */
    public static Comparator<Task> byPriority() {
        return new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return Integer.compare(t1.getPriority().ordinal(), t2.getPriority().ordinal());
            }
        }.reversed();
    }
}
