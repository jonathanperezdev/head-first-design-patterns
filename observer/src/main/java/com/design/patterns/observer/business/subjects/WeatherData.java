package com.design.patterns.observer.business.subjects;

import com.design.patterns.observer.api.State;
import com.design.patterns.observer.business.observers.Observer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class WeatherData implements Subject {
    private List<Observer> observers;
    private State state = new State();

    @PostConstruct
    public void init() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.stream().forEach(observer -> observer.update(state));
    }

    public void setMeasurements(float tempeature, float humidity, float pressure){
        this.state.setTemperature(tempeature);
        this.state.setHumidity(humidity);
        this.state.setPressure(pressure);
        notifyObservers();
    }
}
