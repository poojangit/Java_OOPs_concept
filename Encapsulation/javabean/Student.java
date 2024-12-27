package javabean;

import java.util.Scanner;

public class Student {
    private int rollNo;
    private char grade;

    public void setRollNo(int rollNo) {
        if (rollNo > 0) {
            this.rollNo = rollNo;
        } else
            System.out.println("Roll no must be greater than 0");
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    public char getGrade(){
        return grade;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("Enter a Student's roll no");
        int rollNo = sc.nextInt();
        s.setRollNo(rollNo);
        s.getRollNo();
        System.out.println("Enter Student's grade: ");
        char grade = sc.next().charAt(0);
        s.setGrade(grade);
        s.getGrade();
        sc.close();

    }
}
