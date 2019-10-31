package lt.bit.java.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExrcTeams {

  public static void main(String[] args) {
    splitGroupIntoTeams();
  }

  // padalinom grupę į komandas komandinei užduočiai
  // -----------------------------------------------
  // | A-Team: [Karolis, Marius, Arturas]
  // | B-Team: [Ramunas, Vaidas, Modestas]
  // | C-Team: [Saulius, Paulius, Rokas]
  // | D-Team: [Greta, Giedrius, Diana]
  // -----------------------------------------------
  private static void splitGroupIntoTeams() {
    List<String> students = Arrays.asList("Karolis", "Marius", "Saulius",
        "Paulius", "Greta", "Ramunas", "Arturas", "Giedrius", "Modestas",
        "Vaidas", "Rokas", "Diana");

    for (int i = 0; i < 999; i++) {
      Collections.shuffle(students);
    }

    List<String> teamA = students.subList(0, 3);
    List<String> teamB = students.subList(3, 6);
    List<String> teamC = students.subList(6, 9);
    List<String> teamD = students.subList(9, 12);

    System.out.println("A-Team: " + teamA);
    System.out.println("B-Team: " + teamB);
    System.out.println("C-Team: " + teamC);
    System.out.println("D-Team: " + teamD);
  }
}
