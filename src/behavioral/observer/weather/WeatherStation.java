package behavioral.observer.weather;

public class WeatherStation {
  public static void main(String[] args) {

    WeatherData weatherData = new WeatherData();
    CurrentConditions currentDisplay = new CurrentConditions(weatherData);
    Statistics statisticsDisplay = new Statistics(weatherData);
    Forecast forecastDisplay = new Forecast(weatherData);
    HeatIndex heatIndexDisplay = new HeatIndex(weatherData);

    weatherData.setData(80, 65, 30.4f);
    weatherData.setData(82, 70, 29.2f);
    weatherData.setData(78, 90, 29.2f);
  }
}
