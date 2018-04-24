package com.bvan.oop.hw.lesson9.storage.product;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author bvanchuhov
 */
public class MapProductStorage implements ProductStorage {

    private final Map<Long, Product> idToProduct = new HashMap<>();

    @Override
    public Optional<Product> findById(long id) {
        return Optional.ofNullable(idToProduct.get(id));
    }

    @Override
    public void save(Product product) {
        idToProduct.put(product.getId(), product);
    }

    @Override
    public void deleteById(long id) {
        idToProduct.remove(id);
    }
}
