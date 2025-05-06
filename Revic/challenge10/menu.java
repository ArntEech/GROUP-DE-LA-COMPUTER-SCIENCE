//package Revic.challenge10;

import java.util.ArrayList;

 class Menu{
    ArrayList<MenuItem> MenuList = new ArrayList<>();
    public Menu(){
        MenuItem latte = new MenuItem("latte", 200, 150, 24, 25.0);
        MenuItem espresso = new MenuItem("espresso" , 50 , 0 , 18, 15.0);
        MenuItem cappuccino = new MenuItem("cappuccino" , 250, 50, 24, 30.0);
        MenuList.add(latte);
        MenuList.add(espresso);
        MenuList.add(cappuccino);
    }
public String getItems(){
        String namea ="";
for(MenuItem s :MenuList){
String b =s.getName();
namea= namea+b+"/";
}
//System.out.println(namea);
        return namea;
    }
public MenuItem findDrink(String drinkname){
        for(MenuItem s : MenuList){
if(drinkname.equalsIgnoreCase(s.getName())){
   // System.out.println(s.toString());
    return s;
}
     }
//System.out.println("Drink not available");
            return null;

    }
    
 
}


 class MenuItem{
    private String name;
    private int water;
    private int milk;
    private int coffee;
    private double cost;
public MenuItem(String name, int water, int milk, int coffee, double cost){
    this.name= name;
    this.water = water;
    this.milk= milk;
    this.coffee=coffee;
    this.cost =cost;
}
public String getName(){
    return name;
}
public int getWater(){
    return water;
}
public int getMilk(){
    return milk;
}
public int getCoffee(){
    return coffee;
}
public double getCost(){
    return cost;
}
@Override
public String toString() {
return name + ": water=" + water + "ml, milk=" + milk + "ml, coffee=" + coffee + "g, cost=₵" + cost;
}

}