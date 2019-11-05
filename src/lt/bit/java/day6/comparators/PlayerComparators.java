package lt.bit.java.day6.comparators;

import java.util.Comparator;

class PlayerComparators {

  int i = 10;

  // vidine statine klase
  static class PlayerComparatorByScoreAsc implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
      return 0;
    }
  }

  // vidine klase
  class PlayerComparatorByScoreDesc implements Comparator<Player> {

    int i;

    @Override
    public int compare(Player o1, Player o2) {
      return PlayerComparators.this.i > 0 ? PlayerComparators.this.i : i > 0 ? i : o2.getScore() - o1.getScore();
    }
  }

}
