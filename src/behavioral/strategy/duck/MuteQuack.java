package behavioral.strategy.duck;

public class MuteQuack implements QuackBehaviour {
  @Override
  public void quack() {
    System.out.println("I can't quack");
  }
}
