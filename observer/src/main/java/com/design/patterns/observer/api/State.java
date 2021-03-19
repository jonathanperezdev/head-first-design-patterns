package com.design.patterns.observer.api;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class State {
    private float temperature;
    private float humidity;
    private float pressure;
}
