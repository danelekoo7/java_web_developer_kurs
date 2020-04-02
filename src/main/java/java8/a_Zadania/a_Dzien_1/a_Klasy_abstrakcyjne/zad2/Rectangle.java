package java8.a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.zad2;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        double area = this.length * this.width;
        this.setArea(area);
        return area;
    }


    @Override
    public double calculateCircuit() {
        double circuit = (this.length * 2) + (this.width * 2);
        this.setCircuit(circuit);
        return circuit;
    }


    @Override
    public String toString() {
        return "Prostokąt o bokach " + this.length +
                " i " + this.width +
                " - pole = " + calculateArea() +
                ", obwód = " + calculateCircuit();
    }
}
