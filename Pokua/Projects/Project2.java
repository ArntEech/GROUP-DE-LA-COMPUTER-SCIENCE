package Projects;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Tip Calculator!");

        System.out.println("What was the total bill? ");
        double bill = input.nextDouble();

        System.out.println("What percentage tip would you like to give? 10, 12, or 15?");
        double tipPercent = input.nextDouble();

        System.out.println("How many people to split the bill?");
        int people = input.nextInt();

        double tip = ((bill*tipPercent)+bill)/people;

        System.out.printf("Each person should pay: %d", tip);

        input.close();
    }
}
