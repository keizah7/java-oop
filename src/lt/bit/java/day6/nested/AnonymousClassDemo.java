package lt.bit.java.day6.nested;

class AnonymousClassDemo {

  public static void main(String[] args) {
    InterfaceForAnonymous i = new InterfaceForAnonymous() {
      @Override
      public void helloInterface() {
        System.out.println("Anonymous from interface");
      }
    };
    i.helloInterface();

    AbstractClassForAnonymous a = new AbstractClassForAnonymous() {
      @Override
      void helloAbstract() {
        System.out.println("Anonymous from abstract");
      }
    };
    a.helloAbstract();
  }
}
