package com.bvan.oop.hw.lesson9.storage.generic;

/**
 * Сущность, которая будет храниться в Storage.
 * @param <ID> тип id.
 */
public interface Entity<ID> {
    ID getId();
}
