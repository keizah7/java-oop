package lt.bit.java.day6.input;

import java.util.Scanner;

class InputOutputMain {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      printMenu();
      String line = scanner.nextLine();
      if (line.equals("e")) {
        break;
      }

    }
  }

  private static void printMenu() {
    System.out.println("Meniu...");
    System.out.println("e - iseiti");
    System.out.print("Pasirinkite is meniu: ");
  }
}
