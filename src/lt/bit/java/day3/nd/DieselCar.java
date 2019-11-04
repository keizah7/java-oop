package lt.bit.java.day3.hw;

class DieselCar extends Car {
    DieselCar(String name, String gearBox, int maxSpeed){
        super(name, gearBox, maxSpeed);
    }

    @Override
    String getFuelType() {
        return FUEL_TYPES[0];
    }
}
