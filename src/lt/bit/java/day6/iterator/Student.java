package lt.bit.java.day6.iterator;

class Student {

  private final String name;
  private final int lessonsAttended;

  Student(String name, int lessonsAttended) {
    this.name = name;
    this.lessonsAttended = lessonsAttended;
  }

  @Override
  public String toString() {
    return name + "{" + lessonsAttended + '}';
  }

  public String getName() {
    return name;
  }

  public int getLessonsAttended() {
    return lessonsAttended;
  }
}
