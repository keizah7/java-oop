package lt.bit.java.day1;

public class Task3 {
//    3. Atspausdinkite „Mokausi programuoti Java programavimo kalba“ atvirkštine tvarka. (
//    nenaudokite pagalbinių funkcijų )
//    ablak ....isuakom

    public static void main(String[] args) {
        String text = "Mokausi programuoti Java programavimo kalba";

        System.out.println(text);
        System.out.println(reverseString(text));
    }

    static String reverseString(String text) {
        char letterArr[] = text.toCharArray();
        text = "";

        for (int i = letterArr.length-1; i >= 0; i--) {
            text += letterArr[i];
        }

        return text;
    }
}
