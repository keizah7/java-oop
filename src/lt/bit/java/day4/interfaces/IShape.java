package lt.bit.java.day4.interfaces;

public interface IShape {

  String HEAD = "--- Shapes ---"; // public static final - by default

  static void printHeadline() {
    System.out.println(HEAD);
  }

  default String getName() {
    return getClass().getSimpleName();
  }

  public abstract double getArea(); // public abstract - by default

  double getPerimeter();
}
