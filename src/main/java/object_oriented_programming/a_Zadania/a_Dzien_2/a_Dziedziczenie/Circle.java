package object_oriented_programming.a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Circle extends Shape {
    private double radius;

    public Circle(double x, double y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " promień to " + this.radius;
    }

    public double getArea() {
        return (Math.PI * (this.radius * this.radius));
    }

    public double getCircuit() {
        return (2 * Math.PI * this.radius);
    }
}
