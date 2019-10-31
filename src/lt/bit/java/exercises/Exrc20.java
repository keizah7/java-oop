package lt.bit.java.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a list of strings, return a list where each string has "y" added at its start and end.
 */
class Exrc20 {

  public static void main(String[] args) {
    System.out.println(moreY(Arrays.asList("a", "b", "c"))); //→ ["yay", "yby", "ycy"]
    System.out.println(moreY(Arrays.asList("hello", "there"))); //→ ["yhelloy", "ytherey"]
    System.out.println(moreY(Arrays.asList("yay"))); //→ ["yyayy"]
  }

  private static List<String> moreY(List<String> strings) {
    final char y = 'y';
    List<String> newStrings = new ArrayList<>();
    for (String str : strings) {
      newStrings.add(y + str + y);
    }
    return newStrings;
    // Java 8 way
    //return strings.stream().map(s -> y + s + y).collect(toList());
  }
}
