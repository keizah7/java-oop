package lt.bit.java.day6.nested;

class ContainerClass {

  // vidine paprasta klase
  class InnerClass {

    void hello() {
      System.out.println("Inner");
    }
  }

  // vidine statine klase
  static class InnerStaticClass {

    void hello() {
      System.out.println("Inner static");
    }
  }
}
