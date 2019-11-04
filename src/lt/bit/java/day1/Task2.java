package lt.bit.java.day1;

public class Task2 {
//    2. Apskaičiuokite ir atspausdinkite pirmus 21 fibonacci skaičius. (pradėkite nuo 0).
//    0,1,1,2...6765

    public static void main(String[] args) {
        int n = 21;

        System.out.println("Pirmi "+ n + " fibonacci skaičiai:");
        for (int i = 0; i <= n; i++) System.out.print(fibonacci(i) + (i != n ? ", " : ""));
    }

    static int fibonacci (int number) {
        if (number == 0) return 0;
        else if (number == 1) return 1;
        else return (fibonacci(number -1 ) + fibonacci(number - 2));
    }
}
