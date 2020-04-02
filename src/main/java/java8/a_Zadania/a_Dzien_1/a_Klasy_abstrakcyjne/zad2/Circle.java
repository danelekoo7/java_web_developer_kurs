package java8.a_Zadania.a_Dzien_1.a_Klasy_abstrakcyjne.zad2;

public class Circle extends Shape {

    double perimeter;

    public Circle(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * this.perimeter * this.perimeter;
        this.setArea(area);
        return area;
    }


    @Override
    public double calculateCircuit() {
        double circuit = 2 * Math.PI * this.perimeter;
        this.setCircuit(circuit);
        return circuit;
    }


    @Override
    public String toString() {
        return "Koło o promieniu" + this.perimeter +
                " - pole = " + calculateArea() +
                ", obwód = " + calculateCircuit();
    }

}
