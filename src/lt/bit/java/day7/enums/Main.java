package lt.bit.java.day7.enums;

import java.util.Arrays;

class Main {

  public static void main(String[] args) {
    System.out.println(Sauce.BBQ);
    System.out.println(Arrays.toString(Sauce.values()));

    Sauce sauce = null;
    sauce = Sauce.MILD;
    System.out.println(sauce.name() + ' ' + sauce.ordinal());

    Sauce s1 = null;
    Sauce s2 = Sauce.valueOf("BBQ");
    System.out.println(Sauce.MILD.equals(s1));
//    System.out.println(s1.equals(Sauce.MILD)); // NullPointerException

    System.out.println(s2.equals(s1));
//    System.out.println(s1.equals(s2)); // NullPointerException
    System.out.println(s1 == s2);
  }
}
