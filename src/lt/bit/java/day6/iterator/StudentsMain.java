package lt.bit.java.day6.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Pašalinti studentus, kurie praleido 20% paskaitų.
 */

class StudentsMain {

  private static final int REQUIRED_ATTENDANCE = 80; // lankomumas procentais
  private static final int LESSONS = 20; // is viso paskaitu

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student("R", 1));
    students.add(new Student("S", 19));
    students.add(new Student("A", 16));
    students.add(new Student("N", 11));
    students.add(new Student("K", 20));
    students.add(new Student("D", 18));

    //TODO: apskaiciuoti, kiek turi buti minimaliai paskaitu
    // 100% - 20 paskaitu
    // 80% - x paskaitu

    //TODO: surasti visus studentus, kuriuos reikia pasalint (atspausdinti)

    System.out.println("Before: " + students);
    // 1
    int requiredLessons = REQUIRED_ATTENDANCE * LESSONS / 100;
    Iterator<Student> studentIterator = students.iterator();
    Student st;
    while (studentIterator.hasNext()) {
      st = studentIterator.next();
      System.out.println(st + " - " + st.getLessonsAttended() + " lessons");
      if (st.getLessonsAttended() < requiredLessons) {
        studentIterator.remove();
      }
    }

    // 2
    /*Iterator<Student> studentIterator = students.iterator();
    Student st;
    while (studentIterator.hasNext()) {
      st = studentIterator.next();
      double attendance = Math.floor(st.getLessonsAttended() * 100 / LESSONS);
      System.out.println(st + " - " + attendance + "%");
      if (attendance <= REQUIRED_ATTENDANCE) {
        studentIterator.remove();
      }
    }*/

    System.out.println("After: " + students);
  }
}
