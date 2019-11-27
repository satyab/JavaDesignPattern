package structural.decorator.starbucks;

public class Milk extends CondimentDecorator {

  Beverage beverage;

  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + ", Milk";
  }

  @Override
  public double getCost() {
    return .10 + beverage.getCost();
  }

}
