package lt.bit.java.day3;

class Circle extends Shape {

  private int r;

  Circle(String color, int r) {
    super(color);
    this.r = r;
  }

  @Override
  String getColor() {
    return "circle color - " + super.getColor();
  }

  @Override
  double getArea() {
    return Math.PI * Math.pow(r, 2);
  }

  @Override
  double getPerimeter() {
    return 2 * Math.PI * r;
  }
}
