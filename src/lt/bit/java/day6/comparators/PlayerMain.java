package lt.bit.java.day6.comparators;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lt.bit.java.day6.comparators.PlayerComparators.PlayerComparatorByScoreDesc;

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
    System.out.println();

    System.out.println("by name, naudoja PlayerComparatorByName");
    Collections.sort(players, new PlayerComparatorByName());
    System.out.println(players);
    System.out.println("by name, naudoja PlayerComparatorByName::reversed()");
    Collections.sort(players, new PlayerComparatorByName().reversed());
    System.out.println(players);
    System.out.println();


    System.out.println("by name, naudoja PlayerComparatorByNameLengthAndScore");
    Collections.sort(players, new PlayerComparatorByNameLengthAndScore());
    System.out.println(players);

    System.out.println("comparatorius vidineje paprastoje klaseje");
    PlayerComparators comparators = new PlayerComparators();
    PlayerComparatorByScoreDesc pComp1 = comparators.new PlayerComparatorByScoreDesc();
    PlayerComparatorByScoreDesc pComp2 = new PlayerComparators().new PlayerComparatorByScoreDesc();
    Collections.sort(players, new PlayerComparators().new PlayerComparatorByScoreDesc());

    PlayerComparators.PlayerComparatorByScoreAsc staticComp = new PlayerComparators.PlayerComparatorByScoreAsc();
    Collections.sort(players, staticComp);

    // anonimines klases
    Comparator<Player> pc = new Comparator<Player>() {
      @Override
      public int compare(Player o1, Player o2) {
        return 0;
      }
    };
    Collections.sort(players, new Comparator<Player>() {
      @Override
      public int compare(Player o1, Player o2) {
        return 0;
      }
    });
  }
}
