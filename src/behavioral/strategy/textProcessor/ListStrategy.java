package behavioral.strategy.textProcessor;

public interface ListStrategy {

  default public void start(StringBuilder sb) {
  }

  public void addListItem(StringBuilder sb, String item);

  default public void end(StringBuilder sb) {
  }

}
