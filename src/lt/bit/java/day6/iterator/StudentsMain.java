package lt.bit.java.day6.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Pašalinti studentus, kurie praleido 20% paskaitų.
 */

class StudentsMain {
    private static final int REQUIRED_ATTENDANCE = 80; // lankomumas procentais
    private static final int LESSONS = 20; // is viso paskaitu

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Artūras", 20),
            new Student("Giedrius", 18),
            new Student("Greta", 19),
            new Student("Karolis", 10),
            new Student("Paulius", 5),
            new Student("Sauliune", 2)
        ));

        int minAttendance = LESSONS * REQUIRED_ATTENDANCE / 100;
        Iterator<Student> iterator = students.iterator();
        System.out.println("Geriausi studentai pagal lankomumą (iš viso " + LESSONS + " pamokų): ");

        while (iterator.hasNext()) {
            Student s = iterator.next();
            int minAttendance2 = s.getLessonsAttended() * 100 / LESSONS;

//            if (minAttendance2 >= s.getLessonsAttended()) iterator.remove(); // 2
            if (minAttendance > s.getLessonsAttended()) iterator.remove(); // 1
            else System.out.println(s.getName() + " praleido " + (LESSONS - s.getLessonsAttended()));
        }
    }
}
