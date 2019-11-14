package lt.bit.java.day13.generics;

class Car {
    private final String registrationNumber;
    private final String make;
    private final Owner owner;

    Car(String registrationNumber, String make, Owner owner) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.owner = owner;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public Owner getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "owner=" + owner +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                '}';
    }
}
