package structural.decorator.starbucks;

public abstract class Beverage {
  protected String description = "Unknown Beverage";
  private double cost;

  public String getDescription() {
    return description;
  }

  public abstract double getCost();
}
