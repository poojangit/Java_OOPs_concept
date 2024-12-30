package hierarchical;

public class Circle extends Shape{
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    public double displayCircleArea() {
        return Math.PI*Math.pow(radius, 2);
    }
}
