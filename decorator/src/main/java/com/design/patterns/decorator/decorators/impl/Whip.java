package com.design.patterns.decorator.decorators.impl;

import com.design.patterns.decorator.business.Beverage;
import com.design.patterns.decorator.decorators.CondimentDecorator;

public class Whip implements CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" ,whip";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.10;
    }
}
