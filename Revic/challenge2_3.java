package Revic;
import java.util.Scanner;
public class challenge2_3 {
public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter your age here: ");
       int age=sc.nextInt();
       int year=90-age;
       int month= year*12;
       int week=year*52;
       int days= year*365;
       System.out.println("You have "+ days+" days,"+week+" weeks and "+month+" months "+"left");
        }
    }
    

