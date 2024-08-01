package main;

public class CurrentConditionsDisplay implements Displays, Subscriber{

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
