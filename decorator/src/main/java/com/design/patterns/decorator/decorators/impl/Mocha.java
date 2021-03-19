package com.design.patterns.decorator.decorators.impl;

import com.design.patterns.decorator.business.Beverage;
import com.design.patterns.decorator.decorators.CondimentDecorator;

public class Mocha implements CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" ,mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.20;
    }
}
