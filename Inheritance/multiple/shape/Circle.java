package multiple.shape;

public class Circle implements ColoredShape{
    @Override
    public void draw(String shape){
        System.out.println("You can draw circle or " + shape);
    }

    @Override
    public void fill(String color){
        System.out.println("You can fill red or " + color);
    }

    @Override
    public void discribe(String shape, String color){
        System.out.println("you can draw or  color with " + shape + " and " + color);
    }
}
