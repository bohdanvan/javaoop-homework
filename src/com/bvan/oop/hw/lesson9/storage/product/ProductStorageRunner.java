package com.bvan.oop.hw.lesson9.storage.product;

import java.util.Optional;

/**
 * @author bvanchuhov
 */
public class ProductStorageRunner {

    public static void main(String[] args) {
        ProductStorage productStorage = new MapProductStorage();

        productStorage.save(new Product(11, "MacBook", "Apple's notebook", 2000));
        productStorage.save(new Product(15, "Lenovo", "Lenovo's notebook", 1500));

        Optional<Product> product = productStorage.findById(11L);
        if (product.isPresent()) {
            System.out.println(product.get()); // Product{id=11, name='MacBook', description='Apple's notebook', price=2000}
        }
    }
}
