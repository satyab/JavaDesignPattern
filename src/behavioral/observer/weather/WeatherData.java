package behavioral.observer.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

  private List<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer o) {
    this.observers.add(o);
  }

  @Override
  public void notifyObserver() {
    for (Observer o : this.observers) {
      o.update(temperature, humidity, pressure);
    }
  }

  @Override
  public void remove(Observer o) {
    int index = this.observers.indexOf(o);
    if (index >= 0) {
      this.observers.remove(index);
    }
  }

  public void measurementChanged() {
    notifyObserver();
  }

  public void setData(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementChanged();
  }
}
