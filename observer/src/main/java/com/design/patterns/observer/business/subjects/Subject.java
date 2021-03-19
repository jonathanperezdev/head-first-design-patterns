package com.design.patterns.observer.business.subjects;

import com.design.patterns.observer.business.observers.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
