package lt.bit.java.exercises;

import static java.util.stream.Collectors.toList;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class ExrcLottery {

  public static void main(String[] args) {
    List<Integer> exercises = Stream.iterate(1, i -> ++i).limit(38).collect(toList());
    Collections.shuffle(exercises);
    System.out.println("!!! " + exercises.get(exercises.size() / 2) + " !!!");
  }
}
