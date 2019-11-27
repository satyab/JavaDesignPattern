package structural.decorator.starbucks;

public class Decaf extends Beverage {

  public Decaf() {
    description = "Decaf Coffee";
  }

  public double getCost() {
    return 1.05;
  }
}
