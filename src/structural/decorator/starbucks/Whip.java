package structural.decorator.starbucks;

public class Whip extends CondimentDecorator {

  Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }

  @Override
  public double getCost() {
    return .10 + beverage.getCost();
  }
}
