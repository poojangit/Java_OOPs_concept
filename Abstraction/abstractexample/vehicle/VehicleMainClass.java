package abstractexample.vehicle;

public class VehicleMainClass {
    public static void main(String[] args) {
        Vehical car = new Car(120);
        Vehical bike = new Bike(100);
        car.startEngine();
        car.showSpeed();
        bike.startEngine();
        bike.showSpeed();
    }
}
