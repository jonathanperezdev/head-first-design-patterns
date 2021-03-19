package com.design.patterns.observer.business.observers;


import com.design.patterns.observer.api.State;

public interface Observer {
    void update(State state);
}
