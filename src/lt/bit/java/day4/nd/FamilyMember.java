package lt.bit.java.day4.hw;

abstract class FamilyMember {
    final String name;
    final int age;

    protected FamilyMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
