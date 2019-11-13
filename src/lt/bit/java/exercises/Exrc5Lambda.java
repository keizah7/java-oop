package lt.bit.java.exercises;

@FunctionalInterface
interface GreenTicket {
  int green(int a, int b, int c);
}

class Exrc5Lambda {

  public static void main(String[] args) {
    GreenTicket ticket = (a, b, c) -> {
      if (a == b && b == c) {
        return 20;
      }
      if (a == b || b == c || a == c) {
        return 10;
      }
      return 0;
    };

    System.out.println(ticket.green(1, 2, 3)); //→ 0
    System.out.println(ticket.green(2, 2, 2)); //→ 20
    System.out.println(ticket.green(1, 1, 2)); //→ 10
    System.out.println(ticket.green(1, 2, 2)); //→ 10
    System.out.println(ticket.green(3, 1, 3)); //→ 10

    GreenTicket t2 = (int a, int b, int c) -> 1;
    System.out.println(t2.green(1, 2, 3));
  }
}
