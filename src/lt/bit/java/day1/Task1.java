package lt.bit.java.day1;

public class Task1 {
//    1. Atspaudinkite lietuvos miestų pavadinimus skirtingose eilutėse ( lietuviškomis raidėmis ) :
//    Troškūnai,
//    Kazlų Rūda

    public static void main(String[] args) {
        String arr[] = {"Troškūnai", "Kazlų Rūda"};
        int n = arr.length;
        String c = ", ";

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i != n-1 ? c : ""));
        }

        System.out.println("\n");

        int i = 0;

        while (i < n) {
            System.out.print(arr[i] + (i != n-1 ? c : ""));
            i++;
        }
    }
}
