package Revic;

import java.util.Scanner;

public class challenge2_2 {
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("your weight is:");

Java-programming-b3
double weight=sc.nextDouble();
System.out.println("your height is:");
double height=sc.nextDouble();
double fbmi=weight/(height*height);
int bmi= (int)fbmi;
System.out.println("your weight is:"+ weight + "kg");
System.out.println("your height is:"+height + "m");
System.out.println("your Body Mass Index is:" + bmi);
if (bmi<18.5){
    System.out.println("You are underweight");}
else if(bmi >= 18.5 && bmi<=24.9){
        System.out.println("Your weight is normal");
    }
else if(bmi>=25 && bmi<=29.99){
        System.out.println("You are overweight");
    }
else if(bmi>=30 && bmi <=34.9){
    System.out.println("You are Obese");
}
else{
    System.out.println("You are clnically obese");
}

int weight=sc.nextInt();
System.out.println("your height is:");
int height=sc.nextInt();
int bmi=weight/(height*height);
System.out.println("your weight is:"+ weight + "kg");
System.out.println("your height is:"+height + "m");
System.out.println("your Body Mass Index is:" + bmi);
main
    }
    
}
