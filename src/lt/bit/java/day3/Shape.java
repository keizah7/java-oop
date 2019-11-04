package lt.bit.java.day3;

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

  String getAreaAndPerimeter() {
    String info = String.format("Area: %.2f\n", getArea());
    info += String.format("Perimeter: %.2f\n", getPerimeter());
    info += "Color: " + getColor();
    return info;
  }
}
