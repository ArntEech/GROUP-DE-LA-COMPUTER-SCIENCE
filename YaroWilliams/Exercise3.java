import java.util.Scanner; // Import the Scanner class
public class Exercise3 {
    public static void main(String[] args) {
        // Exercise3 --Inputs & String length--
        // creating an object of the Scanner class called input
        Scanner input = new Scanner(System.in);
        //Asking user to input their name
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        //use object.lenght() to get the length of the string
        System.out.println(name.length());
        input.close();

    }
}