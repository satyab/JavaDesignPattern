package behavioral.strategy.sort;

import java.util.List;

public class Context {

  private ISort sort;

  public Context(ISort sort) {
    this.sort = sort;
  }

  public void setSortingMethod(ISort sort) {
    this.sort = sort;
  }

  public void sortElements(List<Integer> items) {
    sort.sort(items);
  }
}
