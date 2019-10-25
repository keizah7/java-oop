package lt.bit.java.day2.access;

/**
 * Pataisykite Zmogus klasę taip, kad žmogaus vardo ir pavardės po sukūrimo nebūtų galima keisti.
 */
public class Prezidentas {

  public static final String TIKRA_KONSTANTA = "Mr/Ms";
  private static final int MIN_AGE = 40;

  private final String vardas;
  private final String pavarde;
  private int age;
  private static int kadencija = 1;

  public Prezidentas(String vardas, String pavarde) {
    this.vardas = vardas;
    this.pavarde = pavarde;
  }

  static void printKadencija() {
    System.out.println(kadencija);
//    System.out.println(vardas); // negalima
  }

  public String getVardas() {
    return vardas;
  }

  public String getPavarde() {
    return pavarde;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age >= MIN_AGE) {
      this.age = age;
    }
  }

  public static void main(String[] args) {
    Prezidentas p = new Prezidentas("v", "p");
    p.kadencija = 1;
    p.setAge(40);
    System.out.println(p.getAge());
    modifyAge(p);
    System.out.println(p.getAge());

    Prezidentas p2 = new Prezidentas("v2", "p2");
    p2.kadencija = 2;
    System.out.println("Kadencija is p: " + p.kadencija);
    System.out.println("Kadencija is p2: " + p2.kadencija);
    Prezidentas.kadencija = 3;
    System.out.println("Kadencija is klase vardo: " + Prezidentas.kadencija);
    System.out.println("Kadencija is p: " + p.kadencija);
    System.out.println("Kadencija is p2: " + p2.kadencija);
  }

  private static void modifyAge(Prezidentas prezidentas) {
    prezidentas.setAge(41);
  }
}

