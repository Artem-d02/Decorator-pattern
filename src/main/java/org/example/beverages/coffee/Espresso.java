package org.example.beverages.coffee;

import org.example.beverages.Beverage;
import org.example.beverages.cost_stats.COFFEE_COST;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double getCost() {
        return COFFEE_COST.ESPRESSO.getPrice();
    }
}
