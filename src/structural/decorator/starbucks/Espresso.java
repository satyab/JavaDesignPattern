package structural.decorator.starbucks;

public class Espresso extends Beverage {

  public Espresso() {
    this.description = "Espresso";
  }

  @Override
  public double getCost() {
    return 1.99;
  }
}
