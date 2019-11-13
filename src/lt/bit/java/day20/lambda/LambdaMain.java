package lt.bit.java.day20.lambda;

import java.util.Arrays;

class LambdaMain {
    public static void main(String[] args) {
        FancyPrinter fpAnonymous = new FancyPrinter() {
            @Override
            public void print() {
                System.out.println("Viskas anonimiskai");
            }
        };
//        fpAnonymous.print();
        // tas pats kas viršuje
        FancyPrinter fp = () -> System.out.println("Viskas su lambda");
//        fp.print();

        IntToStringConverter c1 = (int i) -> "nieko";
        IntToStringConverter c2 = (i) -> "->" + i + "<-";
        IntToStringConverter c3 = i -> String.valueOf(i);
        IntToStringConverter c4 = String::valueOf;
//        System.out.println(c2.convert(100));

        StringCreator sc = s -> "a" + Arrays.toString(s);
        StringCreator sc2 = String::new;
        StringCreator sc3 = s -> new String(s); //tas pats kas sc2
//        System.out.println(sc.create(new char[]{'a', 'b', 'c'}));

        ParameterizedPrinter pp = (a, b) -> {
            if (a == (int) b) {
                System.out.println(a);
            } else System.out.println("a=" + a + " b=" + b);
        };
//        pp.print(10, 5.0);
//        pp.print(10, 10.0);
//        pp.print(10, 10.2);

        IntToStringConverter multipleLinesSc = i -> {
            if (i > 0) {
                return String.valueOf(i);
            } else if (i == 0) {
                return "0";
            }
            return "I hate negative numbers!";
        };

        // panaudojimas metode
        System.out.println(convertIntToString(1, c1));
        System.out.println(convertIntToString(100, c1));
        System.out.println(convertIntToString(1001, c2));
        System.out.println(convertIntToString(10, c4));
        System.out.println(convertIntToString(-1, multipleLinesSc));
        System.out.println(convertIntToString(2020, i -> "Happy New Year! *^*^*= " + i + " =*^*^*"));
        System.out.println(convertIntToString(2018, i -> {
            if (i > 2018) {
                return "Happy " + i + "!";
            } else {
                return "Not so fast...";
            }
        }));
    }

    private static String convertIntToString(int convertable, IntToStringConverter converter) {
        return converter.convert(convertable);
    }
}
