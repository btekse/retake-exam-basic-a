import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Balázs on 2017. 04. 20..
 */
public class MinMaxDiffTest {
  MinMaxDiff minMaxDiff = new MinMaxDiff();

  @Test
  public void getMin() throws Exception {
    ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList());
    numberList.add(10);
    assertEquals(10, minMaxDiff.getMin(numberList));
  }

  @Test
  public void getMax() throws Exception {
    ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList());
    numberList.add(-10);
    assertEquals(-10, minMaxDiff.getMax(numberList));
  }

  @Test
  public void empty() throws Exception {
    ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList());
    numberList.add(10);
    assertEquals(10, minMaxDiff.getMax(numberList));
  }

}