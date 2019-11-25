package behavioral.observer.weather;

public interface Subject {

  public void registerObserver(Observer o);

  public void notifyObserver();

  public void remove(Observer o);
}
