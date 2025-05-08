//package Revic.challenge10;

import java.util.Scanner;
public class MoneyMachine {
    String currency = "₵";
    Scanner sc = new Scanner(System.in);
    private double profit=0;
    public void report(){
        System.out.println("Profit: "+profit);
    }
   public double processCoins(){
    System.out.println("How many one cedi coins ?");
    int one = sc.nextInt()*1;
    System.out.println("How many 50 peswa coins ?");
    double fifty = sc.nextDouble()*0.50;
    System.out.println("How many 20 peswa coins ?");
    double twenty = sc.nextDouble()*0.20;
    System.out.println("How many 10 peswa coins ?");
    double  ten=sc.nextDouble()*0.10;
    double total= one +fifty+ twenty+ ten;
    System.out.println(profit);
        return total;
   }
   public boolean makePayments(double cost){
    double insertedMoney = processCoins();
    if(insertedMoney>= cost){
        profit = profit+cost;
       double change = insertedMoney -cost;
       System.out.println("Your change is: "+currency+ change);
       return true;
    }
    System.out.println("Not  enough money. Money refunded");
    return false;
   }


}
