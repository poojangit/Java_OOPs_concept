package multiple.animal;

public class Bat implements Animal, Bird{
    @Override
    public void eat() {
        System.out.println("Animal eats");
    }

    @Override 
    public void fly() {
        System.out.println("Bird can fly");
    }
}
