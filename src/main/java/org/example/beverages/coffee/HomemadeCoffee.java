package org.example.beverages.coffee;

import org.example.beverages.Beverage;
import org.example.beverages.cost_stats.COFFEE_COST;

public class HomemadeCoffee extends Beverage {
    public HomemadeCoffee() {
        description = "Homemade coffee";
    }

    @Override
    public double getCost() {
        return COFFEE_COST.HOMEMADE_COFFEE.getPrice();
    }
}
