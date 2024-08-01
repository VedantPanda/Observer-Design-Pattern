package main.Publisher.impl;

import main.Publisher.Publisher;
import main.Subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Publisher {

    private float temperature, humidity, pressure;

    List<Subscriber> subscribers;

    public WeatherData(){
        subscribers = new ArrayList<>();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged() {
        notifySubscribers();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        subscribers.forEach(subscriber -> subscriber.update(temperature, humidity, pressure));
    }
}
