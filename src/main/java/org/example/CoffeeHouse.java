package org.example;

import org.example.beverages.Beverage;
import org.example.beverages.coffee.Espresso;
import org.example.beverages.supplements.Chocolate;
import org.example.beverages.supplements.Milk;

public class CoffeeHouse {
    public static void main(String[] args) {
        CoffeeHouse myCoffeeHouse = new CoffeeHouse();
        myCoffeeHouse.order();
    }
    public void order() {
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        beverage = new Chocolate(beverage);
        beverage = new Chocolate(beverage);
        System.out.println("Your order:");
        System.out.println(beverage.getDescription());
        System.out.printf("Final cost: %.2f$S", beverage.getCost());
    }
}