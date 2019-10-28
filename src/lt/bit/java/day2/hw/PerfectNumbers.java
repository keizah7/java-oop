package lt.bit.java.day2.hw;

/**
 * Tobuluoju skaičiumi vadinamas natūralusis skaičius, lygus visų savo daliklių, mažesnių už save patį, sumai (pvz 28 =
 * 1 + 2 + 4 + 7 + 14). Suraskite visus tokius skaičius iš intervalo 1…1000.
 */
public class PerfectNumbers {

  public static void main(String[] args) {
    for (int i = 1; i <= 1000; i++) {
        if (i == divisorsSum(i)) {
            System.out.println(i + " yra tobulas!");
        }
    }
  } // main

  private static int divisorsSum(int sk) {
    int suma = 0;
    for (int i = sk - 1; i > 0; i--) {
      if (sk % i == 0) {
        suma += i;
      }
    }
    return suma;
  }
}
