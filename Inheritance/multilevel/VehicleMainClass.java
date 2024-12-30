package multilevel;

public class VehicleMainClass {
    public static void main(String[] args) {
        ElectricCar ola = new ElectricCar();
        ola.brand = "Ola";
        ola.speed = 200;
        ola.numOfDoors = 4;
        ola.batteryCapacity = 24;
        ola.displayEVCarDetails();
    }
}
