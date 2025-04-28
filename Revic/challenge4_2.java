package Revic;
import java.util.Random;
import java.util.Scanner;
public class challenge4_2 {
    public static void main(String args[]) {
        Random rm = new Random();
     Scanner sc= new Scanner(System.in);
     String[] name;
     System.out.println("How many people are there?");
     int size=sc.nextInt();
sc.nextLine();
     name=new String[size];
     for (int i=0; i<name.length; i++){
        System.out.println("what is the name?");

        name[i]=sc.nextLine();

     }
     String names=name[rm.nextInt(size)];
     System.out.println(names+" is going to buy the meal today");
    // String[] name=sc.nextLine();
    // String names =name[rm.nextInt()];
    }
}
