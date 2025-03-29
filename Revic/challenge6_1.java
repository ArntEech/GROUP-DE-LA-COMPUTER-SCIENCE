package Revic;
import java.util.Scanner;
public class challenge6_1{
public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Which number do you want to find it's parity ?");
    int num = sc.nextInt();
    if(num%2==0){
        System.out.println("Even number");
    }
    else{
        System.out.println("Odd number");
    }
}
}