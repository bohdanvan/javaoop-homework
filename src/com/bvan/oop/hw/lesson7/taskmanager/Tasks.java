package com.bvan.oop.hw.lesson7.taskmanager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author bvanchuhov
 */
public class Tasks {

    private final List<Task> tasks = new ArrayList<>();

    public void add(Task task) {
        tasks.add(task);
    }

    public void sort(Comparator<Task> comparator) {
        tasks.sort(comparator);
    }

    public Tasks filter(Predicate<Task> predicate) {
        Tasks res = new Tasks();
        for (Task task : tasks) {
            if (predicate.test(task)) {
                res.add(task);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "tasks=" + tasks +
                '}';
    }
}
