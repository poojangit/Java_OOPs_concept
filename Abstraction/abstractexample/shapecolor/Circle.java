package abstractexample.shapecolor;

public class Circle extends Shape{
    double radius ;
    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    @Override
    double area(){
        double areaOfCircle = Math.PI*Math.pow(radius, 2);
        return areaOfCircle;
    }
}
