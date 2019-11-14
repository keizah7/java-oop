package lt.bit.java.exercises;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string has all its "x" removed.
 */
class Exrc23 {

  public static void main(String[] args) {
    System.out.println(noX(List.of("ax", "bb", "cx")));// → ["a", "bb", "c"]
    System.out.println(noX(List.of("xxax", "xbxbx", "xxcx")));// → ["a", "bb", "c"]
    System.out.println(noX(List.of("x")));// → [""]
    System.out.println(noX(Arrays.asList(new String [] {null})));// → [""]
  }

  private static List<String> noX(List<String> xStrings){
    return xStrings.stream()
        .map(s-> s == null ? null : s.replace("x", ""))
        .collect(toList());
  }
}
