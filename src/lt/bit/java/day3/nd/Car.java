package lt.bit.java.day3.nd;

abstract class Car {
    String name, gearBox, make, model;
    int maxSpeed;
    static final String FUEL_TYPES[] = {"diesel", "petrol"};

    public Car(String name, String gearBox, int maxSpeed) {
        this.name = name;
        this.gearBox = gearBox;
        this.maxSpeed = maxSpeed;
    }

    public Car(String gearBox, int maxSpeed) {
        this.gearBox = gearBox;
        this.maxSpeed = maxSpeed;
    }

    public Car() {
    }

    public Car(String gearBox) {
        this.gearBox = gearBox;
    }

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        if (gearBox == "automatic" || gearBox == "manual") {
            this.gearBox = gearBox;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }
    }

    abstract String getFuelType();
}