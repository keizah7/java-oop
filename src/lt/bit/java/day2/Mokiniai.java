package lt.bit.java.day2;

class Mokiniai {

  public static void main(String[] args) {
    Mokinys mokinys = new Mokinys("V", "P", 1);
    Zmogus zmogus = new Zmogus();
    Object obj = mokinys;
    Object obj2 = zmogus;

    Zmogus zmogus1 = new Mokinys("V2", "P2", 1);
    Zmogus zmogus12 = new Mokinys("V2", "P2", 12, new int[]{8, 9, 8});
    Object object = new Zmogus();

    zmogus = mokinys;

    printZmogus(mokinys);
    printZmogus(zmogus1);
  }

  private static void printZmogus(Zmogus mokinys) {
    System.out.println(getFormattedString(mokinys.vardas, mokinys.pavarde));
  }

  private static String getFormattedString(String vardas, String pavarde) {
    return "[Zmogaus duomenys]: " + vardas + ' ' + pavarde;
  }
}
