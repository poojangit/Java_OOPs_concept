package compiletime.person;

public class PersonName {
    String name ;
    int age ;
    public void personName(String name, int age) {
        System.out.println("Name :" + name + " | " + "Age: " + age);
    }
    public void personName(int age , String name){
        System.out.println("Age : " + age + " | " + "Name: " + name);
    }
    public static void main(String[] args) {
        PersonName details = new PersonName();
        System.out.println("Details of a person is as follows----------");
        details.personName(30, "Rahul");
        details.personName("Rohith", 10);

    }
}
