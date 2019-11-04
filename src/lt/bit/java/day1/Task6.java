package lt.bit.java.day1;

public class Task6 {
//    6. Turime du masyvus int[] a = {5, 6, 10, 15, 8, 4} ir int[] b = {8,5, 3}. Raskite kiekvieno masyvo skaičių vidurkį
//    ir atspausdinkite jų skirtumą.
//    2.66666…
    public static void main(String[] args) {
        int a[] = {5, 6, 10, 15, 8, 4};
        int b[] = {8, 5, 3};

        System.out.println(arrAverage(a) - arrAverage(b));
    }

    static double arrAverage(int[] arr) {
        double suma = 0;

        for (int i = 0; i < arr.length; i++) suma += arr[i];

        return suma / arr.length;
    }
}
