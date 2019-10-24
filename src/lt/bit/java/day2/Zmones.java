package lt.bit.java.day2;

class Zmones {

  public static void main(String[] args) {
    Zmogus zm1 = new Zmogus("v1", "p1");
    Zmogus zm2 = new Zmogus("v2", "p2");
    Zmogus zm3 = new Zmogus("v3", "p3");

    Zmogus[] arr = {zm1, zm2, zm3};
    char c = ',';
    for (Zmogus zm : arr) {
      System.out.println("Vardas, Pavarde: " + zm.vardas + c + zm.pavarde);
    }
  }
}
