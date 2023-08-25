package org.example.beverages.coffee;

import org.example.beverages.Beverage;
import org.example.beverages.cost_stats.COFFEE_COST;

public class BlackCoffee extends Beverage {
    public BlackCoffee() {
        description = "Black coffee";
    }

    @Override
    public double getCost() {
        return COFFEE_COST.BLACK_COFFEE.getPrice();
    }
}
