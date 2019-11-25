package behavioral.observer.aircraft;

import java.util.ArrayList;
import java.util.List;

public class ControlTower implements ISubject {

  private List<IObserver> observers;

  public ControlTower() {
    observers = new ArrayList<>();
  }

  @Override
  public void addObserver(IObserver o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(IObserver o) {
    int index = observers.indexOf(o);
    if (index >= 0) {
      observers.remove(index);
    }
  }

  @Override
  public void notifyObservers() {
    for (IObserver observer : observers) {
      observer.update(null);
    }
  }
}
