package abstractexample.vehicle;

public class Bike extends Vehical{
    Bike(int speed){
        super(speed);
    }
    @Override
    public void startEngine(){
        System.out.println("Bike has started with a speed of " + speed + "km/hr");
    }
}
