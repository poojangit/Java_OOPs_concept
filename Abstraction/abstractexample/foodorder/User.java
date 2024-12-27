package abstractexample.foodorder;

import java.util.Scanner;

public class User extends Swiggy{
    //! either make the class as abstract or override...
    @Override
    void orderFood(String name){
        System.out.println("Ordering food: " + name);
    }
    @Override
    void pay(int amount){
        System.out.println("Paying the amount: " + amount);
    }
    public static void paymentDone(int amount){
        if (amount > 0) {
            System.out.println("Your payment is successfull!!!");
        }
        else {
            System.err.println("PLEASE DONT FOOL!!!!!!!!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.println("Enter the food you want to buy: ");
        String name = sc.nextLine();
        user.orderFood(name);
        System.out.println("Enter the amount to pay: ");
        int amount = sc.nextInt();
        user.pay(amount);
        paymentDone(amount);
        sc.close();
    }
}
