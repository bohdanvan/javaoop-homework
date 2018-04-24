package com.bvan.oop.hw.lesson7.taskmanager;

import java.time.LocalDateTime;

/**
 * @author bvanchuhov
 */
public class TaskManagerRunner {

    public static void main(String[] args) {
        Task task2 = new Task(10, "Football", "Play football with friends", LocalDateTime.of(2018, 10, 10, 12, 0), Priority.NORMAL);
        Task task1 = new Task(20, "Learn Java", "Read Bruce Eckel 'Thinking in Java'", LocalDateTime.of(2018, 10, 10, 15, 0), Priority.MAJOR);
        Task task3 = new Task(30, "Movie", "Watch action movie", LocalDateTime.of(2018, 10, 10, 20, 0), Priority.MINOR);


        Tasks tasks = new Tasks();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);

        tasks.sort(TaskComparators.byName());
        System.out.println("By name: " + tasks);

        tasks.sort(TaskComparators.byDeadline());
        System.out.println("By deadline: " + tasks);

        tasks.sort(TaskComparators.byPriority());
        System.out.println("By priority: " + tasks);

        System.out.println("Minor priority: " + tasks.filter(TaskPredicates.hasPriority(Priority.MINOR)));
        System.out.println("Expired deadline: " + tasks.filter(TaskPredicates.hasExpiredDeadline()));
        System.out.println("Contains 'java': " + tasks.filter(TaskPredicates.nameContains("java")));
    }
}
