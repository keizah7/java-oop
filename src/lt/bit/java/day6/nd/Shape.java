package lt.bit.java.day6.nd;

public abstract class Shape {

  private String color;

  public Shape(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public abstract double getArea();

  public abstract double getPerimeter();

  public abstract String toString();

  String getAreaAndPerimeter() {
    String info = String.format(" Area: %.2f ", getArea());
    info += String.format(" Perimeter: %.2f ", getPerimeter());
//    info += "Color: " + getColor();
    return info;
  }

  String getClassName() {
    return "\n"+getClass().getSimpleName()+": ";
  }

}
