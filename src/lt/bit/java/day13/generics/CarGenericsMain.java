package lt.bit.java.day13.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CarGenericsMain {

  public static void main(String[] args) {
    // senas budas, kai galima ideti bet kokius objektus
    // viskas yra Object tipo
    List list = new ArrayList();
    list.add("abc");
    list.add(Integer.valueOf(5));

    for (Object obj : list) {
//      String str = (String) obj; // su Integer kris ClassCastException
    }

    List<String> list1 = new ArrayList<>();
    list1.add("abc");
    //list1.add(new Integer(5)); //compiler error

    List<Car> cars = new ArrayList<>();

    // Car ir visi isvestiniai tipai
    List<? extends Car> cars2 = new ArrayList<>();
    // negalima prideti, nes nezinomas konkretus tipas
    // cars2.add(new Car("", "", null));

    // Car ir visi teviniai tipai
    List<? super Car> cars3 = new ArrayList<>();
    cars3.add(new Car("", "", null));

    // Generic klase
    Garage<Car> garage = new Garage<>();
    garage.setValue(new Car("ABC123", "Honda", null));
    System.out.println(garage.getValue());

    Garage<String> str = new Garage<>();
    str.setValue("bet kas");
    printValue(str.getValue());

    Car[] carrArr = {new Car("ABC123", "VW", null)};
    printArray(carrArr);

    printList(list1);
  }

  // generic metodas
  private static <V> void printValue(V value) {
    System.out.println(value);
  }

  // generic metodas masyvams
  private static <E> void printArray(E[] arr) {
    System.out.println(Arrays.toString(arr));
  }

  // metodas, kuris priima listus su be kurio tipo elementais
  private static void printList(List<?> list) {
    System.out.println(list);
  }
}
