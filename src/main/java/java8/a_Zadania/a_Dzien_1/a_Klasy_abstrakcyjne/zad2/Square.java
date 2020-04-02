package java8.a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.zad2;

public class Square extends Shape {

    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double area = this.side * this.side;
        this.setArea(area);
        return area;
    }


    @Override
    public double calculateCircuit() {
        double circuit = this.side *4;
        this.setCircuit(circuit);
        return circuit;
    }

    @Override
    public String toString() {
        return "Kwadrat o boku " + this.side +
                " - pole = " + calculateArea() +
                ", obwód = " + calculateCircuit();
    }

}
