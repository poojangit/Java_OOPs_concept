package javabean;

import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    public void setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            System.out.println("Hello " + name);
        }
         else
        System.out.println("Name cannot be empty!");
    }
    public void setAge(int age){
        if(age>=18){
            this.age = age;
            System.out.println("Great! You are having a valid age");
        }
        else {
            System.out.println("Soryy !! Age should be greater than 18");
        }
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        System.out.println("Enter your name here: ");
        String name = sc.nextLine();
        e.setName(name);
        e.getName();
        System.out.println("Enter your age here: ");
        int age = sc.nextInt();
        e.setAge(age);
        e.getAge();
        sc.close();

    }

}
