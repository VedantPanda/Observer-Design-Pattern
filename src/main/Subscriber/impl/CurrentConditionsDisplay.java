package main.Subscriber.impl;

import main.Publisher.Publisher;
import main.Subscriber.Displays;
import main.Subscriber.Subscriber;

public class CurrentConditionsDisplay implements Displays, Subscriber {

    private float temperature, humidity;

    private Publisher publisher;

    public CurrentConditionsDisplay(Publisher publisher){
        this.publisher = publisher;
        this.publisher.addSubscriber(this);
    }

    @Override
    public void display() {
        System.out.println("Displaying the current conditions");
        System.out.println("Temperature: "+temperature+" Humidity: "+humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
