package lt.bit.java.day1.nd;

import java.util.Arrays;

class NamuDarbai {
//    ND 10.22
//    --------
//    1. Susumuoti pirmus (mažiausius) penkis nelyginius skaičius iš intervalo [1; 100].
//    2. Susumuoti paskutinius (didžiausius) tris skaičius iš intervalo [1; 100].
//    3 [BONUS]. Duoti 2 int masyvai. Parašyti kodą, kuris sudeda jų elementus į vieną bendrą masyvą.
//    Atspausdinti duotų masyvų ir rezultato reikšmes. Spausdinimui panaudoti 3 skirtingus ciklus: while, for, foreach (for su dvitaškiu).

    public static void main(String[] args) {
        int a[]     = {1, 2};
        int b[]     = {3, 4};
        int ab[]    = joinArrays(a, b);

        sumNumbers(1, 100, 5, true); // 1
        sumNumbers(1, 100, 3, false); // 2
        printArrays(a, b, ab);
    }

    static void sumNumbers(int from, int to, int count, boolean odd){
        int sum         = 0;
        int oddCount    = 0;

        for (int i = from; i <= to; i++) {
            if (i % 2 > 0 && oddCount < count && odd) {
                oddCount++;
                sum += i;
            }
            if (i > to - 3 && !odd) sum += i;
        }

        System.out.println((odd ? "1. " : "2. ") + sum);
    }

    static int[] joinArrays(int[] a, int[] b) {
        int to = a.length + b.length;
        int ab[] = new int[to];

        for (int i = 0; i < to; i++) {
            if (a.length > i){
                ab[i] = a[i];
            } else ab[i] = b[i - a.length];
        }
        return ab;
    }

    static void printArrays(int[] a, int[] b, int[] c){
        int i = 0;

        System.out.print("3.\n a masyvas: ");
        while (i < a.length) {
            System.out.print(a[i] + comma(i, a));
            i++;
        }

        System.out.print("\n b masyvas: ");
        for (i = 0; i < b.length; i++) System.out.print(b[i] + comma(i, b));

        System.out.print("\n a+b masyvas: ");
        i = 0;
        for(int value : c) {
            System.out.print(value + comma(i, c));
            i++;
        }
    }

    static String comma(int i, int[] a){
        return ((i != a.length - 1) ? ", " : "");
    }
}
