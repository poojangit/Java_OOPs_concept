package javabean;

import java.util.Scanner;

public class Person {
    private int age ;
    public void setAge(int age){
        if(age>=0){
            this.age = age;
            System.out.println("Age is successfully inilialized");
        }
        else{
            System.out.println("Not inilialize age");
        }
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        System.out.println("Enter person's age: ");
        int age = sc.nextInt();
        p.setAge(age);
        int ageOfaPerson = p.getAge();
        System.out.println("Age is : " + ageOfaPerson);
        sc.close();
    }
}
