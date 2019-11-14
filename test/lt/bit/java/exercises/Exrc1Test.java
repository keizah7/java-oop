package lt.bit.java.exercises;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class Exrc1Test {

  @Test
  public void testDoubling() {
    int[] result = Exrc1.doubling(new int[]{1, 2, 3});
    String actual = Arrays.toString(result);
    String expected = Arrays.toString(new int[]{2, 4, 6});

    assertEquals(expected, actual);
  }
}