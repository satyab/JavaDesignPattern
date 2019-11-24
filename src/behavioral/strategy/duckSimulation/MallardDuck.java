package behavioral.strategy.duckSimulation;

public class MallardDuck extends Duck {

  public MallardDuck(){
    this.setFlyBehaviour(new FlyNoWay());
    this.setQuackBehaviour(new Quack());
  }
  @Override
  public void display() {
    System.out.println("I am Mallard Duck");
  }
}
