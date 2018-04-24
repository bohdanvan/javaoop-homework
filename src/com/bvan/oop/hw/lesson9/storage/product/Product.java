package com.bvan.oop.hw.lesson9.storage.product;

import com.bvan.oop.hw.lesson9.storage.generic.Entity;

/**
 * @author bvanchuhov
 */
public class Product {

    private final long id;
    private final String name;
    private final String description;
    private final int price;

    public Product(long id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
