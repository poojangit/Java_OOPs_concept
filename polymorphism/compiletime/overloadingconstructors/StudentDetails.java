package compiletime.overloadingconstructors;

public class StudentDetails {
    String name;
    int std;
    StudentDetails(){

    }
    StudentDetails(String name){
        this.name = name;
    }
    StudentDetails(int std) {
        if(std>=0 && std<= 12){
            this.std = std;
        } else {
            System.out.println("valid std");
        }
    }
    StudentDetails(String name, int std){
        this.name = name;
        if(std>=0 && std<= 12){
            this.std = std;
        } else {
            System.out.println("Valid std");
        }
    }
    StudentDetails(int std, String name){
        if(std>=0 && std<= 12){
            this.std = std;
        } else {
            System.out.println("valid std");
        }
        this.name = name;
    }
 public static void main(String[] args) {
   
    StudentDetails student1 = new StudentDetails("Pooja");
    StudentDetails student2 = new StudentDetails(10);
    StudentDetails student3 = new StudentDetails("Rohith", 2);
    StudentDetails student4 = new StudentDetails(11, "ramesh");
    System.out.println(student1.name + " " + student1.std);
    System.out.println(student2.name + " " + student2.std);
    System.out.println(student3.name + " " + student3.std);
    System.out.println(student4.name + " " + student4.std);
 }
}
