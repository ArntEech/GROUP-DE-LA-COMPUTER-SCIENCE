package Revic;
import java.util.Scanner;
public class challenge2_1{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
int num=sc.nextInt();
   int  sum=0;
    for (int value=num; value>0; value/=10){
       int number=value%10;
         sum+=number;
    }
    System.out.println("The sum of the digits of the number is: "+sum);
}
}