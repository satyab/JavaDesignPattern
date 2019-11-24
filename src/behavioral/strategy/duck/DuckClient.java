package behavioral.strategy.duck;

public class DuckClient {
  public static void main(String[] args) {

    Duck d = new MallardDuck();

    d.display();
    d.performFly();
    d.setFlyBehaviour(new FlyWithWings());
    d.performQuack();

  }
}
