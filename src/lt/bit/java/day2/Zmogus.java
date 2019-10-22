package lt.bit.java.day2;

class Zmogus {

  String vardas; // null
  String pavarde; // null
  Keksas[] suvalgytiKeksai = new Keksas[5];
}

class Keksas {

  int dydis;
  boolean suRazinom;

  Keksas(int dydis, boolean suRazinom) {
    this.dydis = dydis;
    this.suRazinom = suRazinom;
  }

  Keksas(boolean arBusRazinu) {
    suRazinom = arBusRazinu;
  }

  Keksas() {
    this.dydis = 10;
  }
}

class ZmogusMain {

  public static void main(String[] args) {
    Zmogus karolis = new Zmogus();
    System.out.println(karolis.vardas);
    karolis.vardas = "Karolis";
    System.out.println(karolis.vardas);
    karolis.pavarde = "Didysis";

    Keksas k1 = new Keksas();// dydis 10
    k1.dydis = 3;
    k1.suRazinom = false;

    Keksas k2 = new Keksas(1, true);

    karolis.suvalgytiKeksai[0] = k1;
    karolis.suvalgytiKeksai[3] = k2;

    for (Keksas kx : karolis.suvalgytiKeksai) {
      if (kx == null) {
        continue;
      }
      System.out.println("Dydis: " + kx.dydis + (kx.suRazinom ? " su razinom" : " be razinu"));
    }
  }
}