package lt.bit.java.day4.interfaces;

class Circle implements IShape, IWithBorderAndColor {

  private int r;

  Circle(int r) {
    this.r = r;
  }

  @Override
  public String getName() {
    return getClass().getCanonicalName();
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
  public String getColor() {
    return "GREEN";
  }

  @Override
  public String getType() {
    return null;
  }

  @Override
  public int getSize() {
    return 0;
  }
}
