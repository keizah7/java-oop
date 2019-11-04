package lt.bit.java.day4.nd;

public class Father extends FamilyMember implements Driver {
    protected Father(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveACar() {
        return true;
    }

    @Override
    public boolean canDriveABike() {
        return true;
    }
}
