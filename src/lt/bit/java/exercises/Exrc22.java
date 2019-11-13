package lt.bit.java.exercises;

import static java.util.stream.Collectors.toList;

import java.util.List;

/**
 * Given a list of integers, return a list where each integer is added to 1
 * and the result is multiplied by 10.
 */
class Exrc22 {

  public static void main(String[] args) {
    System.out.println(math1(List.of(1, 2, 3)));// → [20, 30, 40]
    System.out.println(math1(List.of(6, 8, 6, 8, 1)));// → [70, 90, 70, 90, 20]
    System.out.println(math1(List.of(10)));// → [110]
  }

  private static List<Integer> math1(List<Integer> integers) {
    return integers.stream().map(i -> ++i * 10).collect(toList());
  }
}
