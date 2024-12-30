package hierarchical;

public class ShapeMainClass {
    public static void main(String[] args) {
        Circle circleArea = new Circle(4);
        circleArea.displayShapeType();
        System.out.println("Area of a circle : "+circleArea.displayCircleArea());
        Rectangle rectangleArea = new Rectangle(10, 8);
        rectangleArea.displayShapeType();
        System.out.println("Area of a rectangle : "+ rectangleArea.displayRectangleArea());
    }
}
