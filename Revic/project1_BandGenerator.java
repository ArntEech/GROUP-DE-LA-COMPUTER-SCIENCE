package Revic;
import java.util.Scanner;
public class project1_BandGenerator {
    public static void main (String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Good day. Welcome to the Band");
System.out.println("What city did you grow up in? ");
String city=sc.nextLine();
sc.nextLine();
System.out.println("What is the name of your pet?");
String pet=sc.nextLine();
String bandName=city+pet;
sc.nextLine();
System.out.println("Your Band name is: "+bandName);

    }
}
