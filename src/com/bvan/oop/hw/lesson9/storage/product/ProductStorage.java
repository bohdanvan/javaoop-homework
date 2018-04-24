package com.bvan.oop.hw.lesson9.storage.product;

import java.util.Optional;

/**
 * @author bvanchuhov
 */
public interface ProductStorage {

    Optional<Product> findById(long id);
    void save(Product product);
    void deleteById(long id);
}
