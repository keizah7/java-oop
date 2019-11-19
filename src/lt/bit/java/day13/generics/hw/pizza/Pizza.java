package lt.bit.java.day13.generics.hw.pizza;

class Pizza {
    private final String name;

    Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
