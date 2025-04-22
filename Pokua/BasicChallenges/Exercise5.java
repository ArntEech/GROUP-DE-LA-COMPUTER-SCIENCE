package BasicChallenges;

import java.util.Scanner;

public class Exercise5 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a two-digit number: ");
        String number = input.nextLine();
        String num1 = number.substring(0,1);
        String num2 = number.substring(1,2);
        int sumOfDigits =  Integer.parseInt(num1) + Integer.parseInt(num2);

        System.out.println("The sum of the two digits is: "+sumOfDigits);

        input.close();
    }
}
