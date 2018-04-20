package com.bvan.oop.hw.lesson2.menu;

/**
 * @author bvanchuhov
 */
public class MenuRunner {

    public static void main(String[] args) {
        Menu menuSalad = new Menu("Fresh salad menu");
        menuSalad.addDish(new Dish("Savannah chopped salad", "Fresh flavors put together in a fresh way", 55));
        menuSalad.addDish(new Dish("Caesar salad", "Hail the great Caesar", 35));
        menuSalad.addDish(new Dish("Garden salad", "The beauty of the garden without the gardening", 40));

        Menu menuDessert = new Menu("Dessert menu");
        menuDessert.addDish(new Dish("Marshmallow Crispy", "Marshmallow Crispy", 99));
        menuDessert.addDish(new Dish("New york cheesecake", "New York’s finest...dessert", 120));
        menuDessert.addDish(new Dish("Brownies", "A delicious cure for a bad day.", 111));

        System.out.println(menuSalad.getCheapestDish()); // Dish{name='Caesar salad', description='Hail the great Caesar', price=35}
        System.out.println(menuDessert.getCheapestDish()); // Dish{name='Marshmallow Crispy', description='Marshmallow Crispy', price=99}
    }
}
