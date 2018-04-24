package com.bvan.oop.hw.lesson8.iterablemenu;

import com.bvan.oop.hw.lesson2.menu.Dish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Menu implements Iterable<Dish> {

    private final String name;
    private final List<Dish> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public Dish getCheapestDish() {
        if (dishes.isEmpty()) {
            throw new IllegalStateException("empty menu");
        }

        Dish cheapestDish = dishes.get(0);
        for (Dish dish : dishes) {
            if (cheapestDish.getPrice() > dish.getPrice()) {
                cheapestDish = dish;
            }
        }
        return cheapestDish;
    }

    public String getName() {
        return name;
    }

    @Override
    public Iterator<Dish> iterator() {
        // Use unmodifiableList wrapper to prevent removing elements via iterator.
        return Collections.unmodifiableList(dishes).iterator();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", dishes=" + dishes +
                '}';
    }
}
