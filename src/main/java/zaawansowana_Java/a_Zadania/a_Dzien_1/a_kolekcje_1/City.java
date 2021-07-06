package zaawansowana_Java.a_Zadania.a_Dzien_1.a_kolekcje_1;

public class City {
    private final String name;
    private final int population;

    public City(final String name,final int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}
