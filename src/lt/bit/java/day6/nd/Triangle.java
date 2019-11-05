package lt.bit.java.day6.nd;

class Triangle extends Shape {

  private double a;
  private double b;
  private double c;

  Triangle(String color, double a, double b, double c) {
    super(color);
    this.a = a;
    this.b = b;
    this.c = c;
  }

  @Override
  public double getArea() {
    double p = (a + b + c) / 2;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }

  @Override
  public double getPerimeter() {
    return a + b + c;
  }

  @Override
  public String toString() {
    return getClassName() + getAreaAndPerimeter();
  }
}
