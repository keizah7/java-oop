package lt.bit.java.day4.hw;

public class Son extends FamilyMember implements Driver {
    public Son(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveACar() {
        return (age >= 18);
    }

    @Override
    public boolean canDriveABike() {
        return true;
    }
}
