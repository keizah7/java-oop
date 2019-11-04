package lt.bit.java.day6.comparators;

import java.util.Comparator;

class PlayerComparatorByNameLengthAndScore implements Comparator<Player> {

  @Override
  public int compare(Player player1, Player player2) {
    int equalNames = player1.getName().length() - player2.getName().length();
    if (equalNames == 0) {
      return player1.getScore() - player2.getScore();
    }
    return equalNames;
  }
}
