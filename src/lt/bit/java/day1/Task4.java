package lt.bit.java.day1;

import java.util.Arrays;

public class Task4 {
//    4. Duotas masyvas {-10, 0, 2, 9, -5}. Surūšiuokit masyvo elementus mažėjimo tvarka ir
//    atspausdinkite. (Nenaudokit standartinės masyvo rūšiavimo funkcijos)
//    {9, 2, ...}
    public static void main(String[] args) {
        int arr[] = {-10, 0, 2, 9, -5};

        System.out.println(Arrays.toString(arr));

        arr = orderByDesc(arr);

        System.out.println(Arrays.toString(arr));
    }

    static int[] orderByDesc(int[] arr) {
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = 0; j < arr.length - 1 ; j++) {
                int val = arr[j];

                if (arr[j] < arr[j+1]) {
                    arr[j] = arr[j+1];
                    arr[j+1] = val;
                }
            }
        }

        return arr;
    }
}
