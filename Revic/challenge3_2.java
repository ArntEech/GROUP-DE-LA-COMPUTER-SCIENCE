package Revic;
import java.util.Scanner;
public class challenge3_2 {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Year: ");
    int year= sc.nextInt();
    int year1=sc.nextInt();
    if ((year %4 ==0 && year % 100 != 0) || (year % 400 == 0)){
        System.out.println("Year is leap");
    }
    else{
        System.out.println("year is not leap");
    }
    if ((year1 %4 ==0 && year1 % 100 != 0) || (year1 % 400 == 0)){
        System.out.println("Year is leap");
    }
    else{
        System.out.println("year is not leap");
    }
    }
}
