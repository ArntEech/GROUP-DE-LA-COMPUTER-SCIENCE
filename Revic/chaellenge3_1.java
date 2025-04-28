package Revic;
import java.util.Scanner;
public class chaellenge3_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("your weight is:");
   
   double weight=sc.nextDouble();
   System.out.println("your height is:");
   double height=sc.nextDouble();
   double fbmi=weight/(height*height);
   int bmi= (int)fbmi;
   System.out.println("your weight is:"+ weight + "kg");
   System.out.println("your height is:"+height + "m");
   System.out.println("your Body Mass Index is: " + bmi);
       }
      // if (bmi<)
}
