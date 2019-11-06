package lt.bit.java.day7.enums;

enum Sauce {
  MILD("Svelnus"),
  SPICY("Astrus"),
  MIX("Miksas", 1.5),
  BBQ("Barbekiu");

  private String description;
  private double price;

  // konstruktorius private by default
  Sauce(String desc) {
    description = desc;
  }

  // konstruktorius private by default
  Sauce(String desc, double price) {
    description = desc;
    this.price = price;
  }

  String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return name() + '-' + description + '=' + price + '€';
  }
}
