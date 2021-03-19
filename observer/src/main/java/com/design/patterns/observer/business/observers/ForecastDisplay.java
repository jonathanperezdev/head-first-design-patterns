package com.design.patterns.observer.business.observers;

import com.design.patterns.observer.api.State;
import com.design.patterns.observer.business.subjects.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ForecastDisplay implements Observer{

    @Autowired
    private Subject weatherData;

    private State state;

    private float currentPressure = 29.92f;
    private float lastPressure;

    @PostConstruct
    public void init(){
        weatherData.registerObserver(this);
    }

    @Override
    public void update(State state) {
        this.state = state;
        lastPressure = currentPressure;
        currentPressure = state.getPressure();
        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
