package lt.bit.java.day7.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

class DatesMain {

  public static void main(String[] args) {
    Date d1 = new Date();
    System.out.println(d1);
    String date = new SimpleDateFormat("yyyy-MM-dd EEEE").format(d1);
    System.out.println("formatted old date: " + date);
    System.out.println(new SimpleDateFormat("yyyy-MM-dd E").format(new Date()));

    System.out.println(d1.after(new Date()));
    System.out.println(d1.before(new Date()));

    // Java 8
    LocalDate ld = LocalDate.now();
    System.out.println(ld);
    System.out.println("formatted date: " + ld.format(DateTimeFormatter.ofPattern("YYYY.MM.dd")));

    LocalDateTime ldt = LocalDateTime.now();
    System.out.println(ldt.plusMonths(1).plusYears(1));
    System.out.println("formatted datetime: " + ldt.format(DateTimeFormatter.ofPattern("YYYY.MM.dd HH:mm:ss")));

    System.out.println(ld.equals(ldt.toLocalDate()));

    ZonedDateTime zdt = ZonedDateTime.now().minusDays(2);
    System.out.println(zdt);
  }
}
