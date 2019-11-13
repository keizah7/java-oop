package lt.bit.java.day10.hw;

import static java.util.Comparator.reverseOrder;
import static java.util.Map.Entry.comparingByValue;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * Susikurkite failą su kažkokiu turiniu iš interneto (wikipedijos) ir parašykite programą, kuri išveda žodžius
 * panaudotus tame tekste ir kiek kartų tas žodis buvo panaudotas žodžių panaudojimo mažėjimo tvarka.
 * Pastaba: didžiosios - mažosios raidės laikomos tokiomis pat, t.y. žodžiai Wikipedia ir wikipedia yra tas pats žodis.
 */
class Wiki {

  private static final String WIKI_FILE = "resources/wiki.txt";
  private static final String WORD_DELIMITER = "[\\s,.()\"';]";

  public static void main(String[] args) throws IOException {
    oldWay();
//    clearWay();
//    oneLineWay();
  }

  private static void oldWay() throws IOException {
    List<String> lines = Files.readAllLines(Paths.get(WIKI_FILE));
    lines.stream().forEach(w -> System.out.print(w + ' '));

    Map<String, Integer> wordMap = new HashMap<>();
    for (String line : lines) {
      String[] words = line.split(WORD_DELIMITER);
      for (String w: words) {
        String word = w.trim();
        if (word.length() == 0) continue;
        if (wordMap.containsKey(word)) {
          wordMap.put(word, wordMap.get(word)+1);
        } else {
          wordMap.put(word, 1);
        }
      }
    }

    Map<String, Integer> sortedWordMap = new TreeMap<>(new ValueComparator(wordMap));
    sortedWordMap.putAll(wordMap);

    for (Entry<String, Integer> entry : sortedWordMap.entrySet()) {
      System.out.println(entry);
    }
  }

  private static class ValueComparator implements Comparator<String> {
    private Map<String, Integer> map;

    ValueComparator(Map<String, Integer> map) {
      this.map = map;
    }

    public int compare(String key1, String key2) {
      if (map.get(key1) > map.get(key2)) {
        return -1;
      } else {
        return 1;
      }
    }
  }

  private static void clearWay() throws IOException {
    Path path = Paths.get(WIKI_FILE);
    List<String> allWords = new ArrayList<>();
    Files.lines(path)
        .map(String::trim)
        .filter(line -> !line.isEmpty())
        .map(line -> Arrays.asList(line.split(WORD_DELIMITER)))
        .forEach(list -> list.stream()
            .map(String::trim)
            .filter(word -> !word.isEmpty())
            .forEach(allWords::add)
        );

    Map<String, Long> wordMap = allWords.stream()
        .collect(groupingBy(identity(), counting()));

    wordMap.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEach(System.out::println);
  }

  private static void oneLineWay() throws IOException {
    Files.lines(Paths.get(WIKI_FILE))
        .map(String::trim)
        .filter(line -> !line.isEmpty())
        .flatMap(line -> Arrays.stream(line.split(WORD_DELIMITER)))
        .map(String::trim)
        .filter(word -> !word.isEmpty())
        .collect(groupingBy(identity(), counting()))
        .entrySet().stream()
        .sorted(comparingByValue(reverseOrder()))
        .forEach(System.out::println);
  }
}
