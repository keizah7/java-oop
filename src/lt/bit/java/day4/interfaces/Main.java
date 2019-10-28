package lt.bit.java.day4.interfaces;

class Main {

  public static void main(String[] args) {
    IShape[] shapes = {new Circle(5), new TransparentShape(), new Circle(3), new TransparentShape()};

    IShape.printHeadline();
    for (IShape sh : shapes) {
      System.out.println(sh.getName());
    }
  }
}
