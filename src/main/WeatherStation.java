package main;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        weatherData.setMeasurements(19,20,21);
        weatherData.setMeasurements(22,23,24);
        weatherData.setMeasurements(25,26,27);
    }
}
