package zaawansowana_Java.a_Zadania.a_Dzien_1.b_kolekcje_2;

public class Country {
    private final String name;
    private final String capital;

    public Country(final  String name,final String capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }
}
