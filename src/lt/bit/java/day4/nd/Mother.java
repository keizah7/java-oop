package lt.bit.java.day4.nd;

public class Mother extends FamilyMember implements Driver {
    public Mother(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveACar() {
        return false;
    }

    @Override
    public boolean canDriveABike() {
        return false;
    }
}
