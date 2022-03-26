import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {

  public int halveArray(int[] nums) {
    int totalOperations = 0;
    double toDecrease = 0;
    PriorityQueue<Double> numbers = new PriorityQueue<>(Comparator.reverseOrder());
    for (int e : nums) {
      numbers.add((double) e);
      toDecrease += e;
    }
    for (;toDecrease > 0; totalOperations++) {
      double max = numbers.poll();
      numbers.add(max / 2);
      toDecrease -= max;
    }
    return totalOperations;
  }
}