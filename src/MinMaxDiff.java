import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MinMaxDiff {
  public static void main(String[] args) {
    // Create a function called `minMaxDiff` that takes a list of numbers as parameter
    // and returns the difference between maximum and minimum values in the list
    // Create basic unit tests for it with at least 3 different test cases

    ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(111, 22, 33, 44, 55, 66, 77, 88, 99, 101));

    System.out.println(getMax(numberList) - getMin(numberList));
  }

  public static int getMin(ArrayList<Integer> numberList) {
    int min = numberList.get(0);

    for (int actual : numberList) {
      if (actual < min) {
        min = actual;
      }
    }
    return min;
  }

  public static int getMax(ArrayList<Integer> numberList) {
    int max = numberList.get(0);

    for (int actual : numberList) {
      if (actual > max) {
        max = actual;
      }
    }
    return max;
  }
}
