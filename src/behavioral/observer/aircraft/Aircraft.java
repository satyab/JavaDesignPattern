package behavioral.observer.aircraft;

public class Aircraft implements IObserver {

  ISubject observable;

  public Aircraft(ISubject observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  public void fly() {
    System.out.println("Aircraft is flying");
  }

  public void land() {
    System.out.println("Aircraft landed");
    observable.removeObserver(this);
  }

  @Override
  public void update(Object newState) {
    System.out.println("Got an update");
  }
}
