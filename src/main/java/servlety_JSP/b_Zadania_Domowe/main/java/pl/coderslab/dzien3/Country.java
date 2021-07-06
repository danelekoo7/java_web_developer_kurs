package servlety_JSP.b_Zadania_Domowe.main.java.pl.coderslab.dzien3;

public class Country {
    public String country;
    public String capital;

    public Country(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
