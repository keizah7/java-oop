package lt.bit.java.day6.nested;

class InnerStaticClassDemo {

  public static void main(String[] args) {
    ContainerClass.InnerStaticClass innerStatic = new ContainerClass.InnerStaticClass();
    innerStatic.hello();
    new ContainerClass.InnerStaticClass().hello();
  }
}
