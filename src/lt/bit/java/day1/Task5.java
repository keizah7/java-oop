package lt.bit.java.day1;

public class Task5 {
//    5. Duoti trys skaičiai: a, b, c. Nustatykite ar šie skaičiai gali būti trikampio kraštinių ilgiai ir jei gali tai kokio
//    trikampio: lygiakraščio, lygiašonio ar įvairiakraščio. Apskaičiuokite ir atspausdinkite šių trikampių plotus.
//    Spausdinimui naudokite: System.out.println(“Trikampis = “ + trikampis + “, plotas = " + plotas); Kaip
//    pradinius duomenis panaudokite tokius skaičius:
//            3, 4, 5
//            2, 10, 8
//            5, 6, 5
//            5, 5, 5
//    Trikampis = …, plotas = …

    public static void main(String[] args) {
        triangle(3, 4, 5);
        triangle(2, 10, 8);
        triangle(5, 6, 5);
        triangle(6, 6, 4);
        triangle(5, 5, 5);
    }

    static void triangle (int a, int b, int c) {
//    lygiašonis, kai dvi kraštinės lygios
//    lygiakraštis kai visos kraštinės lygios
//    įvairiakraštis kai visos kraštinės skirtingos

        String type     = "";
        double plotas   = 0;
        int diff        = 0;
        int l           = 0;
        type            =   (a == b && a == c && b == c) ? "lygiakraštis" :
                            (a != b && a != c && b != c) ? "įvairiakraštis" : "lygiašonis";

        System.out.println("a:" + a + " b:" + b + " c:" + c);

        if (a < 1 || b < 1 || c < 1 || a + b <= c || b + c <= a || c + a <= b) {
            System.out.println("Trikampio sudaryti negalima\n");
            return;
        }

        switch (type) {
            case "lygiakraštis":
                plotas = (a * a * Math.sqrt(a) ) / 4;
                break;
            case "įvairiakraštis":
                double p = (a + b + c) / 2;
                plotas = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                break;
            default:
                if (a == b) {
                    diff    = c;
                    l       = a;
                } else if (a == c) {
                    diff    = b;
                    l       = a;
                } else {
                    diff    = a;
                    l       = b;
                }
                double h = Math.sqrt((l * l) - ((diff / 2) * (diff / 2)));
                plotas = h * (diff / 2);

                break;
        }

        System.out.println("Trikampis = " + type + ", plotas = " + String.format("%.2f", plotas) + "\n");
    }
}
