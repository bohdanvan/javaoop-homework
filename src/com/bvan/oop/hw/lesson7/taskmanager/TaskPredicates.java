package com.bvan.oop.hw.lesson7.taskmanager;

import java.time.LocalDateTime;
import java.util.function.Predicate;

/**
 * @author bvanchuhov
 */
public class TaskPredicates {

    /**
     * Ignores case.
     */
    public static Predicate<Task> nameContains(String substring) {
        return new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return task.getName().toUpperCase().contains(substring.toUpperCase());
            }
        };
    }

    public static Predicate<Task> hasExpiredDeadline() {
        return new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return task.getDeadline().compareTo(LocalDateTime.now()) < 0;
            }
        };
    }

    public static Predicate<Task> hasPriority(Priority priority) {
        return new Predicate<Task>() {
            @Override
            public boolean test(Task task) {
                return task.getPriority() == priority;
            }
        };
    }
}
