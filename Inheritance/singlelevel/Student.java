

public class Student extends Person {
    String grade;
    public void displayStudentDetails() {
        displayDetails();
        System.out.println("Grade : " + grade);
    }
}
