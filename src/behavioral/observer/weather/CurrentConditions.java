package behavioral.observer.weather;

public class CurrentConditions implements Observer, DisplayElement {

  private Subject weatherData;
  private float temperature;
  private float humidity;

  public CurrentConditions(Subject subject) {
    this.weatherData = subject;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("Current conditions: " + temperature
        + "F degrees and " + humidity + "% humidity");
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }
}
