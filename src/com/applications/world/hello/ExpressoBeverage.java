package com.applications.world.hello;

/**
 * A beverage type.  Represents a terminal layer in the decorator pattern.
 */
public class ExpressoBeverage extends Beverage {

    Integer cost;

    public ExpressoBeverage(Integer cost) {
        this.cost = cost;
    }

    /**
     * Returns the cost of the Beverage.
     * @return Cost of the Expresso beverage.
     */
    public Integer cost() {
        return cost;
    }
}
