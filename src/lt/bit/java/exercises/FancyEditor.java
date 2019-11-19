package lt.bit.java.exercises;

import java.util.Arrays;
import java.util.List;

/**
 * Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
 *
 * Write a function which takes a list of strings and returns each line prepended by the correct number.
 *
 * The numbering starts at 1. The format is n: string. Notice the colon and space in between.
 */
class FancyEditor {

  static int counter = 1;

  public static void main(String[] args) {
    System.out.println(addNumbering(Arrays.asList("first", "2nd", "nesvarbu", "kiek", "five!")));
  }

  static String addNumbering(List<String> lines) {
    StringBuilder result = new StringBuilder();
    lines.forEach(s -> result.append(counter++).append(": ").append(s).append("\n"));
    return result.toString();
  }
}
