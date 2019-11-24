package behavioral.strategy.duck;

public class DecoyDuck extends Duck {
  @Override
  public void display() {
    System.out.println("I am Decoy Duck");
  }
}
