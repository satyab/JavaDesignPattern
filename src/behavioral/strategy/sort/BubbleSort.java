package behavioral.strategy.sort;

import java.util.List;

public class BubbleSort implements ISort {

  @Override
  public void sort(List<Integer> item) {
    System.out.println("Sorting using Bubble Sort");
  }
}
