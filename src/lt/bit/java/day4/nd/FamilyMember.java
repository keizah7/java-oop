package lt.bit.java.day4.nd;

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
