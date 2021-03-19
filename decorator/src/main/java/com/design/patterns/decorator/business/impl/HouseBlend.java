package com.design.patterns.decorator.business.impl;

import com.design.patterns.decorator.business.Beverage;

public class HouseBlend implements Beverage {
    @Override
    public String getDescription() {
        return "House Blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
