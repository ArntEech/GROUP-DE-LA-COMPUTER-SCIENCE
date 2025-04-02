import java.util.Random;
import java.util.Scanner;
public class Project4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("This is a password generator system, we ask for the numberof letters,symbols and numbers you want to include in your password and then we generate a very strong password for you");
        System.out.println("");

        System.out.println("How many letter will you like to include in your password? ");
        int numOfLetters= input.nextInt();

        System.out.println("How many symbols will you like to include in your password? ");
        int numOfSymbols = input.nextInt();

        System.out.println("How many numbers will you like to include in your password? ");
        int numOfNumbers = input.nextInt();

        String[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
           'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String[] symbols = {'!', '#', '$', '%', '&', '(', ')', '*', '+'};
        String[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }
}