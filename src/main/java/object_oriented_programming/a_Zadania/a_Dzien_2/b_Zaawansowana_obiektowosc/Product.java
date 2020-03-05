package object_oriented_programming.a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;


public class Product {

    public int id;
    public static int nextId=1;
    public String name;
    public double price;

    public Product() {
        this.id = nextId;
        nextId++;
    }

    public Product ( String name, double price) {
        this.id = nextId;
        nextId++;
        this.name = name;
        try {
            this.price=setPrice(price);
        } catch (Exception e) {
            System.out.println("zbyt niska kwota");;
        }
    }

    public double setPrice(double price) throws Exception {
        if (price >= 0.01) {
            this.price = price;
        } else {
            throw new Exception("zbyt mała kwota");
        }
        return this.price;
    }


}
