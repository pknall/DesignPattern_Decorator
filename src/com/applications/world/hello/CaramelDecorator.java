package com.applications.world.hello;

/**
 * Wraps the beverage decoration in a CaramelDecorator.
 */
public class CaramelDecorator extends AddonDecorator {
    Beverage beverage;
    Integer cost;

    /**
     * Wraps Beverage and adds a CaramelDecorator to the beverages decorations.
     * @param beverage The next inner layer of the decoration.
     * @param cost Cost of this Addon
     */
    public CaramelDecorator(Beverage beverage, Integer cost) {
        this.beverage = beverage;
        this.cost = cost;
    }

    /**
     * Returns the total of this Decorator and successive inner layers.
     * @return Total of this and successive decoration layers.
     */
    public Integer cost() {
        return this.beverage.cost() + cost;
    }
}
