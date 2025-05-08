//package Revic.challenge10;

import java.util.HashMap;

public class coffeeMaker {
private int water=300;
private int milk=200;
private int coffee=100;

/*public coffeeMaker(){
    this.water =water;
    this.milk = milk;
    this.coffee =coffee;
}*/
public void report(){
    System.out.println("Water: "+ water+"ml");
    System.out.println("Milk: "+ milk+"g");
    System.out.println("Coffee: "+coffee+"ml");
}

public boolean isResourceSufficient(MenuItem drink){
    boolean canMake=true;
if(drink.getWater()>water){
    System.out.println("Not enough water");
canMake = false;
}

if(drink.getMilk()>milk){
    System.out.println("Not enough milk");
canMake = false;
}

if(drink.getCoffee()>coffee){
   System.out.println("Not enough coffee");
canMake = false;
}
/*if(canMake==true){
System.out.println("Resource is sufficient");
}*/
return canMake;
}
public void makeCoffee(MenuItem drink){
   // if(isResourceSufficient(drink)==true){
    coffee=  coffee- drink.getCoffee();
    milk= milk-drink.getMilk();
    water =water - drink.getWater();
    System.out.println("Done. Here is your  "+drink.getName()+" Enjoy");
   // }
  //  else{ System.out.println("Not enough resources"}
}
}

