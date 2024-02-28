package org.example;

public class Customer {

    public Cook order(String menuName, Menu menu, Cooking cooking) {

        MenuItem menuItem = menu.choose(menuName);
        return cooking.makeCook(menuItem);
    }
}
