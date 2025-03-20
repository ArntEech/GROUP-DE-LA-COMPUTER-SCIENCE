// Execise 3 - Inputs Exercise

// Instructions
// Write a program that prints the number of characters in a user's name.
// Warning:
// Your program should work for different inputs. e.g. any name that you input.
// name = input("What's your name? ")

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Lenght of name is "+name.length());

        input.close();
    }
}