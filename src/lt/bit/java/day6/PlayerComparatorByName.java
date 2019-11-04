package lt.bit.java.day6;

import java.util.Comparator;

class PlayerComparatorByName implements Comparator<Player> {

  @Override
  public int compare(Player player1, Player player2) {
    return player1.getName().compareTo(player2.getName());
  }
}
