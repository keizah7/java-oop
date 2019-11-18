package lt.bit.java.day13.generics.hw.pizza;

enum Sauce {
    MILD("švelnus"), SPICY("aštrus"), MIX("miksas");

    Sauce(String description) {
        this.description = description;
    }

    private final String description;

    String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
