package main;

public class ForecastDisplay implements Displays, Subscriber{

    private float temperature, humidity, pressure;

    private Publisher publisher;

    public ForecastDisplay(Publisher publisher){
        this.publisher = publisher;
        this.publisher.addSubscriber(this);
    }

    @Override
    public void display() {
        System.out.println("Displaying the forecast");
        System.out.println("Temperature: "+temperature+" Humidity: "+humidity+" Pressure: "+pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
