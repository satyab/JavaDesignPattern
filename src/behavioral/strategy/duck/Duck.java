package behavioral.strategy.duck;

public abstract class Duck {
  private FlyBehaviour flyable;
  private QuackBehaviour quackable;

  public void swim() {
    System.out.println("I am swimming...!!!");
  }

  public abstract void display();

  public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
    this.flyable = flyBehaviour;
  }

  public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
    this.quackable = quackBehaviour;
  }

  public void performFly() {
    this.flyable.fly();
  }

  public void performQuack() {
    this.quackable.quack();
  }
}
