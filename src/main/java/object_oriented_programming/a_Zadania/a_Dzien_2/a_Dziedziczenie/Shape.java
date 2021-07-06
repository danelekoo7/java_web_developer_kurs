package object_oriented_programming.a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Shape {
    private double x;
    private double y;
    private String color;

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getDescription() {
        return "x= " + this.x + " y= " + this.y + " color to: " + this.color;
    }

    public double getDistance(Shape shape) {


        double a = shape.x - this.x;
        double b = shape.y - this.y;

        double ap = Math.pow(a, 2);
        double bp = Math.pow(b, 2);

        double result = Math.sqrt((ap + bp));

        return result;


    }

}
