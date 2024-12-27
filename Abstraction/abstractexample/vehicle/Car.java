package abstractexample.vehicle;

public class Car extends Vehical {
    Car(int speed){
        super(speed);
    }
    @Override
    public void startEngine(){
        System.out.println("Car has started with a speed " + speed + "km/hr");
    }

}
