package org.example.beverages;

public abstract class SupplementDecorator extends Beverage {
    protected Beverage beverage;
    @Override
    public abstract String getDescription();
}
