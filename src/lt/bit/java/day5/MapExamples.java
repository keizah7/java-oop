package lt.bit.java.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class MapExamples {

  public static void main(String[] args) {
    Map<String, Integer> fruits = new HashMap<>();
    fruits.put("watermelon", 5);
    fruits.put("pear", 15);
    fruits.put("lemon", 100);
    fruits.put("grape", 99);
    fruits.put("apple", 1);
    System.out.println("Number of lemons: " + fruits.get("lemon"));

    System.out.println(fruits);
    System.out.println("\nTreeMap (fruits): " + new TreeMap<>(fruits));
  }
}
