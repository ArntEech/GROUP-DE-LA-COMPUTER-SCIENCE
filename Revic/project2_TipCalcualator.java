package Revic;
import java.util.Scanner;
public class project2_TipCalcualator {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Good day. Welcome to the Tip Calculator");
        System.out.println("What is the total bill amount");
        double bill=sc.nextDouble();
        System.out.println("choose a tip percentage: 5, 10 or 15");
        int tip = sc.nextInt();
       /*  if(tip == 5 || tip == 10 || tip ==15){
        }
        
        else{
            System.out.println("Tip must be 5, 10 or 15");

        }*/
System.out.println("How many people are there ?");
int ppl =sc.nextInt(); 
double tamt=(tip/100.0)*bill;
double tbill=tamt+bill;
double indbill=tbill/ppl;
System.out.println("Tip % is is "+tip+"%");

System.out.println("Tip amount is "+tamt+"cedis");

System.out.println("Total bill is "+tbill+"cedis");

System.out.println("Each person should pay "+indbill+"cedis");


    }
}
