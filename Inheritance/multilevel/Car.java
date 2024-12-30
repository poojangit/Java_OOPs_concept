package multilevel;

public class Car extends Vehicle {
    int numOfDoors;
    public void displayCarDetails(){
        displayVehicleDetails();
        System.out.println("No of doors: " + numOfDoors);
    }
}
