package org.example.beverages.supplements;

import org.example.beverages.Beverage;
import org.example.beverages.SupplementDecorator;
import org.example.beverages.cost_stats.SUPPLEMENT_COST;

public class Whip extends SupplementDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }
    @Override
    public double getCost() {
        return beverage.getCost() + SUPPLEMENT_COST.WHIP.getPrice();
    }
}
