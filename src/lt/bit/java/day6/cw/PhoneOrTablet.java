package lt.bit.java.day6.cw;

class Phone {

  String keyboard = "in-built";
}

class Tablet extends Phone {

  boolean playMovie = false;
}

class College2 {

  public static void main(String args[]) {
    Phone phone = new Tablet();
//    Phone phone = null;
//    System.out.println(phone.keyboard + ":" + phone.playMovie);
//    System.out.println(phone.keyboard + ":" + ((Tablet) phone).playMovie);
    if (phone instanceof Tablet) {
      System.out.println(phone.keyboard + ":" + ((Tablet) phone).playMovie);
    }
  }
}