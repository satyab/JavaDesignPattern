package structural.decorator.starbucks;

public class Mocha extends CondimentDecorator {
  Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + " , Mocha";
  }

  @Override
  public double getCost() {
    return 0.20 + beverage.getCost();
  }
}
