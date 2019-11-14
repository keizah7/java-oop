package lt.bit.java.day21.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

class IntStreamMain {
  public static void main(String[] args) {
    int[] arr = {-10, 0, 2, 9, -5};
    System.out.println("Suma: " + IntStream.of(arr).sum());

    // is masyvo padaryti streama ir suskaiciuoti jo elementus
    System.out.println(Arrays.stream(arr).count());
  }
}
