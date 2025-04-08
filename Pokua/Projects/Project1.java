package Projects;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Band Name Generator!\n");

        System.out.println("What's the name of the city you grew up in?");
        String city = input.nextLine();

        System.out.println("What's your pet's name?");
        String pet = input.nextLine();

        System.out.println("Your band name could be: ");
        System.out.println(city + " " + pet);
    }
}
