package lt.bit.java.day4.wrapperclasses;

class WrapperMain {

  public static void main(String[] args) {
    int intPrimitive = 10;
    Integer intObject = intPrimitive;
    System.out.println("primitive: " + intPrimitive);
    System.out.println("object: " + intObject);

    intObject = null;
    intObject = 100; // boxinama by default: Integer.valueOf(100);
    // intPrimitive = intObject; // gavom NullpointerException, nes buvo unboxinama kvieciant: intObject.intValue();
    System.out.println("primitive: " + intPrimitive);
    System.out.println("object: " + intObject);
  }
}
