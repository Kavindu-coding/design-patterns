package com.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver (Observer o){
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++){
            observers.forEach(o -> o.update(temperature,humidity,pressure));
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements( float temperature, float humidity, float pressure){
        this.pressure = pressure;
        this.humidity = humidity;
        this.temperature = temperature;
        measurementsChanged();
    }

}
