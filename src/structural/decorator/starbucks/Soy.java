package structural.decorator.starbucks;

public class Soy extends CondimentDecorator {
  Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }

  @Override
  public double getCost() {
    return .15 + beverage.getCost();
  }
}
