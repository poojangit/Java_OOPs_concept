package javabean;

import java.util.Scanner;

public class BankAccount {
    private double balance;
    public void setBalance(double balance){
        if (balance > 0) {
            System.out.println("You are having a sufficient balance");
            this.balance = balance;
        }
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Balance after deposit: "+balance);
        } else {
            System.out.println("Please enter a valid amount");
        }
    }
    public void withDraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Balance after withdraw: "+balance);
        } else {
            System.out.println("Please enter a valid amount. Invalid Withdrawal!!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();
        System.out.println("Enter a Balance: ");
        double balance = sc.nextDouble();
        b.setBalance(balance);
        double balanceAmount = b.getBalance();
        System.out.println(balanceAmount);
        System.out.println("Enter a amount to deposit");
        double amount = sc.nextDouble();
        b.deposit(amount);
        System.out.println("Enter the amount to withdraw: ");
        amount = sc.nextDouble();
        b.withDraw(amount);
        sc.close();

    }
}
