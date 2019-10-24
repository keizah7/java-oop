package lt.bit.java.day2;

class Mokinys extends Zmogus {

  int klase;
  int[] trimestras;

  Mokinys(String vardas, String pavarde, int klase) {
    super(vardas, pavarde);
    this.klase = klase;
  }

  public Mokinys(String vardas, String pavarde, int klase, int[] trimestras) {
    this(vardas, pavarde, klase);
    this.trimestras = trimestras;
  }
}
