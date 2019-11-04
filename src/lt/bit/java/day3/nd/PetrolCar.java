package lt.bit.java.day3.nd;

class PetrolCar extends Car {
    PetrolCar(String name, String gearBox, int maxSpeed){
        super(name, gearBox, maxSpeed);
    }

    @Override
    String getFuelType() {
        return FUEL_TYPES[1];
    }
}
