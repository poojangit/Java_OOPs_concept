package hierarchical;

public class Rectangle extends Shape{
    double length , height;
    Rectangle(double length, double height){
        this.length = length;
        this.height = height;
    }
    public double displayRectangleArea() {
        return length*height;
    }
}
