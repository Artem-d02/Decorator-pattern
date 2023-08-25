package org.example.beverages.coffee;

import org.example.beverages.Beverage;
import org.example.beverages.cost_stats.COFFEE_COST;

public class Cappuccino extends Beverage {
    public Cappuccino() {
        description = "Cappuccino";
    }

    @Override
    public double getCost() {
        return COFFEE_COST.CAPPUCCINO.getPrice();
    }
}
