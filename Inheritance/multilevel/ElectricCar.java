package multilevel;

public class ElectricCar extends Car{
    double batteryCapacity;
    public void displayEVCarDetails() {
        displayCarDetails();
        System.out.println("Battery capacity: " + batteryCapacity);
    }
}
