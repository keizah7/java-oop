package lt.bit.java.day5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListExamples {

  public static void main(String[] args) {
    List<Integer> integerArrayList = new ArrayList<>();
    integerArrayList.add(1);
    integerArrayList.add(11);

    System.out.println(integerArrayList);
    System.out.println("Size of integerArrayList is " + integerArrayList.size());

    List<Integer> integerLinkedList = new LinkedList<>(integerArrayList);
    integerLinkedList.add(100);
    System.out.println(integerLinkedList);
    System.out.println("Size of integerLinkedList is " + integerLinkedList.size());

    System.out.println("\nAppended:");
    appendList(integerArrayList);
    System.out.println(integerArrayList);

    appendList(integerLinkedList);
    System.out.println(integerLinkedList);

    appendList((ArrayList) integerArrayList);

    if (integerLinkedList instanceof ArrayList) {
      appendList((ArrayList) integerLinkedList);
    } else {
      System.out.println("integerLinkedList is not an ArrayList");
    }
  }

  private static void appendList(List<Integer> list) {
    list.add(list.get(1) * 99 + 2);
    list.add(0);
    list.add(0);
    list.add(0);
  }

  private static void appendList(ArrayList<Integer> list) {
    System.out.println("I'm too lazy, next time.");
  }
}
