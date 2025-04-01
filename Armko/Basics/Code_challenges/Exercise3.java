import java.util.Scanner; // Scanner class imported to help add user text to the program
public class Exercise3{
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        // An object or instance of the scanner class with the "system.in" input stream to allow text input.
        System.out.println("Enter text:");
        // nextLine is a methoed in scanner that allows you to count a whole line.
        String new_Text = input1.nextLine();
        System.out.println("The text you entered is " + new_Text);
        // Printing out the number of characters typed in.
        System.out.println("The number of characters you entered is " + new_Text.length());
    }



}