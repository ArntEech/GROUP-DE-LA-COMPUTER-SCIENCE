import java.util.Random;
import java.util.Scanner;
public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("a random name from a list of names you provide will be asked to pay the bill for the food u purchase !");
        System.out.println(" ");

        System.out.println("Enter the names, seperated by a comma(,)");
        String namesInput = input.nextLine();

        String[] names = namesInput.split(",");
        // Trim the whitespaces that preceed or are after the names to prevent any issues
        for(int i = 0; i < names.length; i++){
            names[i] = names[i].trim();
        }

        int randomIndex = random.nextInt(names.length);
        String randomName = names[randomIndex];

        System.out.println(randomName+" will pay for the meal today");

        input.close();

    }
}
