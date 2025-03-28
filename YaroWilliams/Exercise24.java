import java.util.Scanner;
public class Exercise24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(word);
        sb.reverse();

        String reversedString = sb.toString();
        System.out.println("Reverse of the word: "+reversedString);

        input.close();
    }
}
