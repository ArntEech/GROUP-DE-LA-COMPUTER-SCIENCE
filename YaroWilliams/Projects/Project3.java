import java.util.Random;
import java.util.Scanner;
public class Project3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String userChoice ="";
        String[] compChoices = {"Rock","Paper","Scissors"};
        
        System.out.println("");
        System.out.println("----Welcome to the Rock, Paper, Scissors Game!----");
        System.out.println("You are competing against Defending champion(THE COMPUTERRR!!!)");
        System.out.println("Try to have fun cos it's definetely going to be fun kicking your ass!!.hahahaaa");

        System.out.println("Rock, Paper, Scissors \n (0 for Rock, 1 for Paper, 2 for Scissors)");
        int choiceNum = input.nextInt();

        // if(choiceNum == 0){
        //     userChoice = "Rock";
        // }else if(choiceNum == 1){
        //     userChoice = "Paper";
        // }else if(choiceNum == 2){
        //     userChoice = "Scissors";
        // }

        //Enhanced switch or rule switch 
        switch(choiceNum){
            case 0 ->userChoice = "Rock";
            case 1 ->userChoice ="Paper";
            case 2->userChoice ="Scissors";
            default ->System.out.println("Enter 0,1 or 2");
        }

        int randomIndex = random.nextInt(3);
        String computerChoice = compChoices[randomIndex];
        
        System.out.println("Your pick: "+userChoice);
        System.out.println("Computer's pick: "+computerChoice);

        switch(userChoice){
            case "Rock" -> {
                switch(computerChoice){
                    case "Rock" -> System.out.println("It is a tie!, Lucky you");
                    case "Paper"-> System.out.println("I win!, you are too soft hahahaaa");
                    case "Scissors"-> System.out.println("You win..., You have broken my scissors!, arghhhhhhh!!");
                }
            }
            case "Paper"-> {
                switch(computerChoice){
                    case "Rock" -> System.out.println("You win!, Now I'll have to get this paper off my rock!");
                    case "Paper"-> System.out.println("It's a tie, you just got lucky!!");
                    case "Scissors"-> System.out.println("You lost!, you better look for glues to put those papers together..hahahaa");
                }
            }
            case "Scissors"-> {
                switch(computerChoice){
                    case "Rock"-> System.out.println("I won!!, crushed you scissors into pieces..hahahah");
                    case "Paper"-> System.out.println("You win!, don't worry I've got more papers, bring it on!");
                    case "Scissors"->System.out.println("It's a tie!, we go again!");
                }
            }
            default -> System.out.println("Enter a correct choice");
        }

    }
}