package lt.bit.java.day6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class PlayerMain {

  public static void main(String[] args) {
    List<Player> players = Arrays.asList(
        new Player("Simas", 20),
        new Player("Jonas", 25),
        new Player("Mantas", 3)
    );

    System.out.println(players);
    System.out.println("default order, naudoja Comparable is Player");
    Collections.sort(players);
    System.out.println(players);

    System.out.println("by name, naudoja PlayerComparatorByName");
    Collections.sort(players, new PlayerComparatorByName());
    System.out.println(players);
    System.out.println("by name, naudoja PlayerComparatorByName::reversed()");
    Collections.sort(players, new PlayerComparatorByName().reversed());
    System.out.println(players);

    System.out.println("by name, naudoja PlayerComparatorByNameLengthAndScore");
    Collections.sort(players, new PlayerComparatorByNameLengthAndScore());
    System.out.println(players);
  }
}
