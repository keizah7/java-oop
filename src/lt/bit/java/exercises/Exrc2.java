package lt.bit.java.exercises;

/**
 * Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
 * The string may be any length.
 * If there are fewer than 2 chars, use whatever is there.
 * extraFront("Hello") → "HeHeHe"
 * extraFront("ab") → "ababab"
 * extraFront("H") → "HHH
 */
class Exrc2 {

  public static void main(String[] args) {
    System.out.println(extraFront("Hello"));// → "HeHeHe"
    System.out.println(extraFront("ab"));// → "ababab"
    System.out.println(extraFront("H"));// → "HHH"
    System.out.println(extraFront(""));// → ""
    System.out.println(extraFront(null));// → null
  }

  static String extraFront(String str) {
    if (str == null) return null;
    String substr = str.length() < 2 ? str : str.substring(0, 2);
    return substr + substr + substr;
//    return substr.repeat(3);
  }
}
