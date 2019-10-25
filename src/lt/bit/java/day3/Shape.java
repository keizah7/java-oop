package lt.bit.java.day3;

abstract class Shape {

  private String color;

  Shape(String color) {
    this.color = color;
  }

  String getColor() {
    return color;
  }

  abstract double getArea();

  abstract double getPerimeter();

  String getAreaAndPerimeter() {
    String info = String.format("Area: %.2f\n", getArea());
    info += String.format("Perimeter: %.2f\n", getPerimeter());
    info += "Color: " + getColor();
    return info;
  }
}
