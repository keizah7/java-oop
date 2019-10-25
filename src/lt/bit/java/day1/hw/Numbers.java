package lt.bit.java.day1.hw;

/**
 * 1. Susumuoti pirmus (mažiausius) penkis nelyginius skaičius iš intervalo [1; 100].
 * 2. Susumuoti paskutinius (didžiausius) tris skaičius iš intervalo [1; 100].
 */
class Numbers {
    public static void main(String[] args) {
        sumTop5();
        sumLast3();
    }

    private static void sumTop5() {
        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
                counter++;
            }
            if (counter == 5) {
                break;
            }
        }
        System.out.println("Top 5: " + sum);
    }

    private static void sumLast3() {
        int sum = 0;
        int min = 100 - 3;

        for (int i = 100; i > min; i--) {
            sum += i;
        }
        System.out.println("Last 3: " + sum);
    }
}
