package lt.bit.java.exercises;

class Exrc3 {

  /**
   * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and
   * "java" yields "ya". If either string is length 0, use '@' for its missing char.
   */
  public static void main(String[] args) {
    System.out.println(lastChars("last", "chars")); // → "ls"
    System.out.println(lastChars("yo", "java")); // → "ya"
    System.out.println(lastChars("hi", "")); // → "h@"
  }

  private static String lastChars(String first, String second) {
    final char defaultChar = '@';
    char firstChar = first.length() == 0 ? defaultChar : first.charAt(0);
    char lastChar = second.length() == 0 ? defaultChar : second.charAt(second.length() - 1);
    return "" + firstChar + lastChar;
//    return String.valueOf(firstChar).concat(String.valueOf(lastChar));
//    char[] chars = {firstChar, lastChar};
//    return String.valueOf(chars);
  }
}
