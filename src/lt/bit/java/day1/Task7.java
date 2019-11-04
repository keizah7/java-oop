package lt.bit.java.day1;

public class Task7 {
//    7. Tobuluoju skaičiumi vadinamas natūralusis skaičius, lygus visų savo daliklių, mažesnių už save patį, sumai.
//    Suraskite visus tokius skaičius iš intervalo 1…1000.
//    28 = 1 + 2 + 4 + 7 + 14
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int suma = 0;

            for (int j = 1; j < i; j++) if (i % j == 0) suma += j;

            if(suma == i) System.out.println(i);
        }
    }
}
