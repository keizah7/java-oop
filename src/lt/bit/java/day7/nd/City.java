package lt.bit.java.day7.nd;

public enum City implements Comparable<City> {
    KLAIPEDA(100000), VILNIUS(1000000), KAUNAS(500000);

    private int population;

    City(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return name()+" {" +
                "population=" + population +
                '}';
    }

    public int getPopulation() {
        return population;
    }
}
