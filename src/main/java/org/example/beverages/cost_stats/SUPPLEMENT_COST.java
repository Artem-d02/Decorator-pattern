package org.example.beverages.cost_stats;

public enum SUPPLEMENT_COST {
    MILK(0.10), CHOCOLATE(0.30), WHIP(0.20);
    private double price;
    SUPPLEMENT_COST(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
