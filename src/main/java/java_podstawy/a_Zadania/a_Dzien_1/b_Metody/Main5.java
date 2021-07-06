package java_podstawy.a_Zadania.a_Dzien_1.b_Metody;


public class Main5 {

    public static void main(String[] args) {
        double calaKwota = 100;
        double podatek = 0.23;
        double kwotaNetto = calculateNetto(calaKwota, podatek);
        System.out.println(kwotaNetto);
    }

    static double calculateNetto(double gross, double vat) {
        // trzeba podzielić wartość brutto przez 100% + wartość podatku
        double netto = gross / (1 + vat);
        return netto;
    }
}
