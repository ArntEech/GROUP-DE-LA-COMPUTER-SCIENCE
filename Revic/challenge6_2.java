package Revic;
import java.util.Scanner;
public class challenge6_2 {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int sum=0;
for (int i=1; i<=num; i++){
sum =sum+i;
}
System.out.println("ths sum of numbers from 1 to "+num+" is "+sum);
    }
}
