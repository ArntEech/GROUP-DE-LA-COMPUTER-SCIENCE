package Projects;

import java.util.Scanner;
import java.util.Random;

public class Project3 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String rock = "_______ ---' ) () () () ---.(_)" ;
        String paper = "_______ ---' ) ______) ____) ) ---.)";
        String scissors = "_______ ---' ) _) ______) () ---.()";

        System.out.println("------Welcome to the Rock, Paper, Scissors game!\n" +
                "\n" +
                "You will be playing against the one and only, the undefeated champion: THE COMPUTER !!!!\n" +
                "\n" +
                "Good luck and remember to have fun!"+"\n");

        System.out.println("Rock, Paper, Scissors; Which of these will you choose? (0 for Rock, 1 for Paper, 2 for Scissors):");
        String choice = input.nextLine();

        String[] options = { rock, paper, scissors };
        int randomIndex = random.nextInt(options.length);

        String comp = Integer.toString(randomIndex);
        System.out.println("Computer Selects "+comp);

        if (choice.equals("0") || choice.equals("1") || choice.equals("2")) {
            if (choice.equals(comp)) {
                System.out.println("It's a tie, play again!");
            } else if (choice.equals("0") && comp.equals("2")) {
                System.out.println("You win! Rock beats Scissors.");
            } else if (choice.equals("0") && comp.equals("1")) {
                System.out.println("You lose! Paper beats Rock.");
            } else if (choice.equals("1") && comp.equals("0")) {
                System.out.println("You win! Paper beats Rock.");
            } else if (choice.equals("1") && comp.equals("2")) {
                System.out.println("You lose! Scissors beats Paper.");
            } else if (choice.equals("2") && comp.equals("1")) {
                System.out.println("You win! Scissors beats Paper.");
            } else if (choice.equals("2") && comp.equals("0")) {
                System.out.println("You lose! Rock beats Scissors.");
            }
        } else {
            System.out.println("Invalid input");
        }

    }
}
