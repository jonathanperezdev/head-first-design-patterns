package com.design.patterns.decorator.decorators.impl;

import com.design.patterns.decorator.business.Beverage;
import com.design.patterns.decorator.decorators.CondimentDecorator;

public class Soy implements CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" ,soy";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.15;
    }
}
