package org.example.beverages.cost_stats;

public enum COFFEE_COST {
    BLACK_COFFEE(0.49), HOMEMADE_COFFEE(1.09), ESPRESSO(0.99), CAPPUCCINO(0.69);
    private double price;
    COFFEE_COST(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
