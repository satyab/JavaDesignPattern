package behavioral.strategy.sort;

import java.util.List;

public class MergeSort implements ISort {

  @Override
  public void sort(List<Integer> item) {
    System.out.println("Sorting using Merge Sort");
  }
}
