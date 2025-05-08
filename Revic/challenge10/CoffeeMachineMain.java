//package Revic.challenge10;
import java.util.Scanner;
public class CoffeeMachineMain {
    public static void main(String[] args) {  
     Scanner sc = new Scanner(System.in);
        MoneyMachine money = new MoneyMachine();
    Menu mymenu = new Menu();
coffeeMaker use = new coffeeMaker();
   // System.out.println(mymenu.getItems());   
    boolean isOn = true;
    while(isOn){
System.out.println("What would you want ? "+mymenu.getItems());
String key =sc.next();
MenuItem Drink = mymenu.findDrink(key);
//boolean decides = use.isResourceSufficient(Drink);

if(key.equalsIgnoreCase("off")){
  //  isOn = false;
    System.out.println("Machine off");
    isOn =false;
}
if(key.equalsIgnoreCase("report")){
    use.report();
}
else{
    if(use.isResourceSufficient(Drink)){
    if(key.equalsIgnoreCase("report")){
        System.out.println(mymenu.getItems());
        //isOn = true;
    }
    //while (use.isResourceSufficient(Drink)) {
   if(money.makePayments(Drink.getCost())==true){
    use.makeCoffee(Drink);
   }
  //isOn = true;
  
//}
}
/*if(use.isResourceSufficient(Drink)==false){
    isOn =false;
}*/
}
    }
    
}
}
