package lt.bit.java.day4.interfaces;

class TransparentShape implements IShape {

  @Override
  public double getArea() {
    return 0;
  }

  @Override
  public double getPerimeter() {
    return 0;
  }
}
