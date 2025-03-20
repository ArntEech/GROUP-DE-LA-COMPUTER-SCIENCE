package Revic;

import java.util.Scanner;

public class challenge2_2 {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("your weight is:");

int weight=sc.nextInt();
System.out.println("your height is:");
int height=sc.nextInt();
int bmi=weight/(height*height);
System.out.println("your weight is:"+ weight + "kg");
System.out.println("your height is:"+height + "m");
System.out.println("your Body Mass Index is:" + bmi);
    }
    
}
