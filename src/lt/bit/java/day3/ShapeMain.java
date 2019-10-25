package lt.bit.java.day3;

class ShapeMain {

  public static void main(String[] args) {
    Shape[] shapes = {new Triangle("red", 3, 4, 5), new Circle("white", 5)};

    for (Shape shape : shapes) {
      printShapeInfo(shape);
    }
  }

  private static void printShapeInfo(Shape sh) {
    System.out.println(sh.getClass().getSimpleName() + ": ");
    System.out.println(sh.getAreaAndPerimeter() + "\n");
  }
}
