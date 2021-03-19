package com.design.patterns.observer.business.observers;

import com.design.patterns.observer.api.State;
import com.design.patterns.observer.business.Display;
import com.design.patterns.observer.business.subjects.Subject;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Getter
@Setter
@Component
public class CurrentConditionsDisplay implements Observer, Display {

    @Autowired
    private Subject weatherData;

    private State state;

    @PostConstruct
    public void init(){
        weatherData.registerObserver(this);
    }

    @Override
    public void update(State state) {
        this.state = state;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions temperature "+state.getTemperature() +" humidity "+state.getHumidity());
    }
}
