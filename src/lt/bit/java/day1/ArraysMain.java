package lt.bit.java.day1;

import java.util.Arrays;

class ArraysMain {

  public static void main(String[] args) {
    int[] arr = {2, 4, 8, 16};
    System.out.println(arr.length);

    int[] b = new int[7];
    b[0] = 2;
    b[3] = 5; // {2, 0, 0, 5, 0 ....}
    System.out.println(b.length);

    String strings[] = new String[10]; // {null, ...., null}

    String[] strs = new String[]{"abc", "bhl"};

    int[] array = {2,3}, irr = {};


    int[] intArr = {1, 2, 3, 4, 5};
    System.out.println("length: " + intArr.length + " " + Arrays.toString(intArr));

    int intArr2[] = new int[3];
    intArr2[1] = 1;
    System.out.println("length: " + intArr2.length + " " + Arrays.toString(intArr2));
    intArr2[1] = 2;
    intArr2[2] = 3;
    System.out.println("length: " + intArr2.length + " " + Arrays.toString(intArr2));

    String[] stringArr = new String[]{"aa", "bb"};
    System.out.print("\nstringArr: ");
    for (String s : stringArr) {
      System.out.print(s + " ");
    }

    int a = 10;
    a = a++ + a;
    System.out.println(a);

    for (int i = 0; i < stringArr.length; i++) {
      System.out.print(stringArr[i] + " ");
    }
  }
}
