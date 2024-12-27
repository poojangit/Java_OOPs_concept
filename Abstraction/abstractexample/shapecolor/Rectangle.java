package abstractexample.shapecolor;

public class Rectangle extends Shape {
    double length ;
    double breadth;
    Rectangle(String color, double length, double breadth  ){
        super(color);
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double area(){
        double areaOfRectangle = length*breadth;
        return areaOfRectangle;
    }
}
