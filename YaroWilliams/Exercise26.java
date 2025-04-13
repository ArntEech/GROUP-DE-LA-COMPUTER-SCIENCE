import java.util.Scanner;
public class Exercise26 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("This program checks if a number is prime or not.");
        System.out.println("Enter a number:");
         int number = input.nextInt();

         

         if (number < 2) {
            System.out.println(number + " is not a prime number.");
               } else if((number % 2) == 0) {
                  System.out.println(number + " is not a prime number.");
               }
            }
         }

