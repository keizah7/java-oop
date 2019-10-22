package lt.bit.java.day1;

class ConditionsMain {

  public static void main(String[] args) {
//    ifs();
//    switchas();
//    doWhileLoop();
    whileAndForLoops();
  }

  static void ifs() {
    boolean a = false;
    boolean b = true;

    if (19 > 21 && a) {
      System.out.println("if");
    } else if (!b) {
      System.out.println("b is true");
    } else {
      System.out.println("else");
    }

    int var = (a == b) ? 10 : 5;
    System.out.println(var);
  }

  static void switchas() {
    int number = 10;
    switch (number) {
      default:
        System.out.println(0);
      case 1:
        System.out.println(1);
      case 10:
        System.out.println(1 + 10);
        break;
      case 5:
        System.out.println(5);

    }
  }

  static void whileAndForLoops() {
    int i = 1;
    while (i <= 5) {
      System.out.println("i=" + i);
      i++;
    }

    for (int j = 1; j <= 5; j++) {
      System.out.println("j=" + j);
    }
  }

  static void doWhileLoop() {
    int i = 2, suma = 0;
    do {
      suma += i;
      i += 2;
    } while (i <= 100);
    System.out.println("2 + 4 + … + 100 = " + suma);
  }
}
