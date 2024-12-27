package interfaceexample.vehicle;

public class VehicleMainClass {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
        Vehicle car = new Car();
        car.start();
        car.stop();
    }
}
