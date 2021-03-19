package com.design.patterns.decorator.business.impl;

import com.design.patterns.decorator.business.Beverage;

public class Espresso implements Beverage {
    @Override
    public String getDescription() {
        return "espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
