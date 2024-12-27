package abstractexample.shapecolor;

public class MainShapeClass {
    public static void main(String[] args) {
        // Circle c = new Circle("Red", 10);
        // Rectangle r = new Rectangle("Blue", 5, 10);
        Shape circle = new Circle("Red", 10);
        Shape rectangle = new Rectangle("Blue", 5, 10);
        System.out.println("Color or a circle "+circle.getColor());
        System.out.println("Area of a circle "+circle.area());
        System.out.println("Color and area of a cicle");
        System.out.println(rectangle.getColor());
        System.out.println(rectangle.area());
        
    }
}
