package lt.bit.java.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string is replaced by 3 copies of the string
 * concatenated together.
 */
class Exrc19 {

  public static void main(String[] args) {
    System.out.println(copies3(List.of("a", "bb", "ccc")));// → ["aaa", "bbbbbb", "ccccccccc"]
    System.out.println(copies3(List.of("24", "a", "")));// → ["242424", "aaa", ""]
    System.out.println(copies3(List.of("hello", "there")));// → ["hellohellohello", "theretherethere"]
    System.out.println(copies3(Arrays.asList(null, null)));// → []
  }

  static List<String> copies3(List<String> strings) {
    return strings.stream()
        //.filter(s -> s != null)
        .map(s -> s == null ? null : s.repeat(3))
        .collect(Collectors.toList());
  }
}
