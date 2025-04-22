package BasicChallenges;

import java.util.Scanner;

public class Exercise11{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Papa's Pizza!");

        System.out.println("What size do you want? S, M or L : ");
        String size = input.nextLine();

        System.out.println("Do you want pepperoni? Y or N : ");
        String pepperoni = input.nextLine();

        System.out.println("Do you want extra cheese? Y or N : ");
        String extra = input.nextLine();

        int totalPrice=0;

        if (size.equals("S")) {
            totalPrice += 15;
        } else if (size.equals("M")) {
            totalPrice += 20;
        } else if (size.equals("L")) {
            totalPrice += 25;
        } else {
            System.out.println("Invalid size input.");
        }

        if (pepperoni.equals("Y")) {
            if (size.equals("S")) {
                totalPrice += 2;
            } else {
                totalPrice += 3;
            }
        }

        if (extra.equals("Y")) {
            totalPrice += 1;
        }

        System.out.println("Your final bill is: $" + totalPrice);

        input.close();
    }

}
