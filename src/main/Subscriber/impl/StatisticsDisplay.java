package main.Subscriber.impl;

import main.Publisher.Publisher;
import main.Subscriber.Displays;
import main.Subscriber.Subscriber;

public class StatisticsDisplay implements Displays, Subscriber {

    private float temperature, humidity, pressure;

    private Publisher publisher;

    public StatisticsDisplay(Publisher publisher){
        this.publisher = publisher;
        this.publisher.addSubscriber(this);
    }

    @Override
    public void display() {
        System.out.println("Displaying the statistics");
        System.out.println("Temperature: "+temperature+" Pressure: "+pressure+" Humidity: "+humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
