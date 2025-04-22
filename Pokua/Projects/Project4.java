package Projects;

import java.util.*;

public class Project4 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Number of symbols to include: ");
        int numberOfSymbols = input.nextInt();

        System.out.println("Number of letters to include: ");
        int numberOfLetters = input.nextInt();

        System.out.println("Number of numbers to include: ");
        int numberOfNumbers = input.nextInt();

        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        StringBuilder randomLetters= new StringBuilder();
        for (int i=0; i<numberOfLetters ;i++){
            char randomLetter = letters[random.nextInt(letters.length)];
            randomLetters.append(randomLetter);
        }

        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        StringBuilder randomNumbers= new StringBuilder();
        for (int i=0; i<numberOfNumbers ;i++){
            char randomNumber = numbers[random.nextInt(numbers.length)];
            randomNumbers.append(randomNumber);
        }

        char[] symbols = {'!', '#', '$', '%', '&', '(', ')', '*', '+'};
        StringBuilder randomSymbols = new StringBuilder();
        for (int i=0; i<numberOfSymbols ;i++){
            char randomSymbol = symbols[random.nextInt(symbols.length)];
            randomSymbols.append(randomSymbol);
        }

        String password = randomLetters.toString() +randomNumbers.toString() + randomSymbols.toString();

        List<Character> passwordFinal = new ArrayList<>();
        for (char c : password.toCharArray()) {
            passwordFinal.add(c);
        }

        Collections.shuffle(passwordFinal);
         StringBuilder pass = new StringBuilder();
         for (char i : passwordFinal){
             pass.append(i);
         }

        System.out.println(pass);

    }
}
