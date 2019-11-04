package lt.bit.java.day5.nd;

import java.util.*;

public class Array {
//    ND 10.31
//    --------
//    1. Duotas masyvas (pvz.: {-10, 0, 2, 9, -5}). Surikiuokite jo elementus didėjimo tvarka (galima naudoti sort funkciją).
//    Po to paverskite masyvą į Listą ir surikiuokite listo elementus mažėjimo tvarka.
//    Atspausdinkite elementus prieš ir po rikiavimo abiem atvejais.

    public static void main(String[] args) {
        int arr[] = {-10, 0, 2, 9, -5};
        Arrays.sort(arr);

        List<Integer> numbers = new ArrayList<>(arr.length);
        for (int i : arr) numbers.add(i);
        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
        System.out.println(numbers);
    }
}
