package abstractexample.vehicle;

public abstract class Vehical {
    int speed;
    Vehical(int speed){
        this.speed = speed;
    }
    public abstract void startEngine();
    public void showSpeed(){
        System.out.println("Speed: " + speed + "km/hr");
    }
}
