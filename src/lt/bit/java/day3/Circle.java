package lt.bit.java.day3;

class Circle extends Shape {

  private int r;

  Circle(String color, int r) {
    super(color);
    this.r = r;
  }

  @Override
  public String getColor() {
    return "circle color - " + super.getColor();
  }

  @Override
  public double getArea() {
    return Math.PI * Math.pow(r, 2);
  }

  @Override
  public double getPerimeter() {
    return 2 * Math.PI * r;
  }
}
