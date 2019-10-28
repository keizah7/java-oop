package lt.bit.java.exercises;

class Exrc5 {

  public static void main(String[] args) {
    System.out.println(greenTicket(1, 2, 3)); //→ 0
    System.out.println(greenTicket(2, 2, 2)); //→ 20
    System.out.println(greenTicket(1, 1, 2)); //→ 10
    System.out.println(greenTicket(1, 2, 2)); //→ 10
    System.out.println(greenTicket(3, 1, 3)); //→ 10
  }

  private static int greenTicket(int a, int b, int c) {
    if (a == b && b == c) return 20;
    if (a == b || b == c || a == c) return 10;
    return 0;
  }
}
