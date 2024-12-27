package interfaceexample.employee;

public class Oggy implements Employee {
    @Override
    public void work(){
        System.out.println("Oggy is working sincerly");
    }
    public static void main(String[] args) {
        System.out.println("id : " + Employee.id);
        Oggy o = new Oggy();
        o.work();
    }
}
