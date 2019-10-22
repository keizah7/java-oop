package lt.bit.java.day1;

/**
 * JavaDoc
 */
class Main {

  public static void main(String[] args) {
    byte byteVar = 125;
    int intVar = 128;

    byteVar = (byte) intVar;

    float floatVar = 2.5f;
    double doubleVar = 2.5;

    boolean ab = false;
    boolean bc = true;

    char charVar = 'z';
    String name = "BIT";

    String result = 1 + 2 + "Hello " + (1 + 2) + name + byteVar + 999;
//    System.out.println(result);

    int a = 3 * 2; // 6
    int y;
    y = 5;
    System.out.println(y);

    int b = -a * 2 + 16; // 4
    int c = a / b; // 1
    System.out.println(c);

    double d = (double) a / b; // 1.5
    System.out.println(d);
    double e = 1.0 * a / b;
    System.out.println(e);
    // 10 / 3 = 3
    // 10 % 3 = 1
    // 15 / 4 = 3
    // 15 % 4 = 3
    int f = a % 4; // 2
    f += 5;
    a *= 2 + b; // tas pats kas a = a * (2 + b)
    final int j = a + 15;
    //j = 5; // negalima

    a = 6;
    int x = a-- + 2;// x=a+2=6+2=8; a=a-1=6-1=5;
    x = a-- + 2;// x=5+2=7; a=4;
    x = --a + 2;// a=a-1=4-1=3; x=a+2=3+2=5;

    y = ++a * 2;// a=3+1=4; y=4*2=8;
    System.out.println("a=" + a + ", y=" + y);

    boolean bb = false;
    bb = !bb;
    boolean cc = bb && ! bb;
    System.out.println(cc);
  }
}
