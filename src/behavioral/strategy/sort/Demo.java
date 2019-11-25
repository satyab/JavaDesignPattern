package behavioral.strategy.sort;

import java.util.ArrayList;
import java.util.List;

public class Demo {

  public static void main(String[] args) {

    Context ctc = new Context(new BubbleSort());
    List<Integer> items = new ArrayList<>();
    items.add(3);
    items.add(2);
    items.add(1);

    ctc.sortElements(items);

    ctc.setSortingMethod(new MergeSort());
    ctc.sortElements(items);
  }
}
