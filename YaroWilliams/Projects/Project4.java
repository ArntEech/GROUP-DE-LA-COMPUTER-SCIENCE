import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
                    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String[] symbols = {"!", "#", "$", "%", "&", "(", ")", "*", "+"};

        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<numOfLetters; i++){
            // randomly get the index of the symbols array
            int randomIndex = random.nextInt(symbols.length);
            // append the symbol to the StringBuilder
            sb.append(letters[randomIndex]);
        }
        for(int i =0;i <numOfNumbers; i++){
            int randomIndex = random.nextInt(numbers.length);
            sb.append(numbers[randomIndex]);
        }
        for(int i = 0; i< numOfSymbols; i++){
            int randomIndex = random.nextInt(symbols.length);
            sb.append(symbols[randomIndex]);
        }

       // convert stringBuilder to List

       List<Character> passwordChars = new ArrayList<>();
       for(int i =0; i<sb.length();i++){
            passwordChars.add(sb.charAt(i));
       }

       Collections.shuffle(passwordChars);

       StringBuilder shuffledPassword = new StringBuilder();

       for(char c : passwordChars){
        shuffledPassword.append(c);
       }

       System.out.println("Here is your password: "+shuffledPassword);
    }

}