package com.bvan.oop.hw.lesson9.storage.generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Реализация хранилища на основании HashMap.
 */
public class MapStorage<T extends Entity<ID>, ID> implements Storage<T, ID> {

    private final Map<ID, T> idToEntity = new HashMap<>();

    @Override
    public Optional<T> findById(ID id) {
        return Optional.ofNullable(idToEntity.get(id));
    }

    @Override
    public void save(T entity) {
        idToEntity.put(entity.getId(), entity);
    }

    @Override
    public void deleteById(ID id) {
        idToEntity.remove(id);
    }
}
