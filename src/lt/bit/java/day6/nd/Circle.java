package lt.bit.java.day6.nd;

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

  @Override
  public String toString() {
    return getClassName() + getAreaAndPerimeter();
  }
}
