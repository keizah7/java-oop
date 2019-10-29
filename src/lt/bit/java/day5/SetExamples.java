package lt.bit.java.day5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class SetExamples {

  public static void main(String[] args) {
    Set<Integer> hashSet = new HashSet<>();
    hashSet.add(10);
    hashSet.add(45);
    hashSet.add(15);
    hashSet.add(15);

    System.out.println(hashSet);
    System.out.println("Size of hashSet is " + hashSet.size());

    appendSet(hashSet);
    System.out.println(hashSet);

    Set<Integer> treeSet = new TreeSet<>(hashSet);
    System.out.println("TreeSet: " + treeSet);

    Set<String> names = new TreeSet<>();
    names.add("Jonas");
    names.add("Jhonas");
    names.add("Adomas");
    names.add("Sarah");
    System.out.println("TreeSet (names): " + names);
  }

  private static void appendSet(Set<Integer> list) {
    list.add(0);
    list.add(99 + 2);
    list.add(10);
    list.add(0);
  }
}
