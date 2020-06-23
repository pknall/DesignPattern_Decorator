package com.applications.world.hello;

/**
 * Abstract class for the Decorator Objects.  Overrides the cost() method
 * of the Beverage class.  This allows calls to cost() to dig through
 * successive layers of decoration.
 * Will wrap either a AddonDecorator or a Beverage object.
 */
public abstract class AddonDecorator extends Beverage {
    public abstract Integer cost();
}
