package java8.a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.zad2;

public abstract class Shape {
    private double area;
    private double circuit;
    private String color;

    public abstract double calculateArea();

    public abstract double calculateCircuit();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCircuit() {
        return circuit;
    }

    public void setCircuit(double circuit) {
        this.circuit = circuit;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
