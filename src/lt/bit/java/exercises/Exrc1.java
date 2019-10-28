package lt.bit.java.exercises;

import java.util.Arrays;

class Exrc1 {

  public static void main(String[] args) {
    int[] intArr = {1, 2, 3}; // {2, 4, 6}
    System.out.println(Arrays.toString(intArr));
    System.out.println(Arrays.toString(doubling(intArr)));
    System.out.println(Arrays.toString(doubling(new int[]{6, 8, 6, 8, -1}))); // → [12, 16, 12, 16, -2]
    System.out.println(Arrays.toString(doubling(new int[]{}))); // → []
  }

  static int[] doubling(int[] arr) {
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      result[i] = arr[i] * 2;
    }
    return result;
  }
}
