package lt.bit.java.day2.access;


/**
 * Pataisykite Zmogus klasę taip, kad žmogaus vardo ir pavardės po sukūrimo nebūtų galima keisti.
 */
public class Prezidentas {

  public static final String TIKRA_KONSTANTA = "Mr/Ms";

  private final String vardas;
  private final String pavarde;
  private int age;

  public Prezidentas(String vardas, String pavarde) {
    this.vardas = vardas;
    this.pavarde = pavarde;
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
    if (age >= 40) {
      this.age = age;
    }
  }
}

