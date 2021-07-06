package object_oriented_programming.a_Zadania.a_Dzien_1.c_Metody;

public class Car {
    private String brand;
    private String model;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString() {
        return getBrand() + " " + getModel() + " " + Double.toString(getPrice());
    }
}

