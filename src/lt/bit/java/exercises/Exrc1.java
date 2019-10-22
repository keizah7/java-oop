package lt.bit.java.exercises;

import java.util.Arrays;

class Exrc1 {

  public static void main(String[] args) {
    int[] intArr = {1, 2, 3}; // {2, 4, 6}
    System.out.println(Arrays.toString(intArr));

    for (int i = 0; i < intArr.length; i++) {
//      intArr[i] = intArr[i] * 2;
      intArr[i] *= 2;
    }
    System.out.println(Arrays.toString(intArr));
  }
}
