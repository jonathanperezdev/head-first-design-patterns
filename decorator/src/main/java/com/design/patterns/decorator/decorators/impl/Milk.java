package com.design.patterns.decorator.decorators.impl;

import com.design.patterns.decorator.business.Beverage;
import com.design.patterns.decorator.decorators.CondimentDecorator;

public class Milk implements CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" ,milk";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.1;
    }
}
