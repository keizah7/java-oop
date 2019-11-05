package lt.bit.java.day6.comparators;

class Player implements Comparable<Player> {

  private String name;
  private int score;

  Player(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  @Override
  public int compareTo(Player otherPlayer) {
    return this.getScore() - otherPlayer.getScore();
  }

  @Override
  public String toString() {
    return "Player{" +
        "name='" + name + '\'' +
        ", score=" + score +
        '}';
  }
}
