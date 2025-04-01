import java.util.Scanner;
public class Project1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Band Name Generator!");

        System.out.println("Enter the Name of your city: ");
        String city = input.nextLine();

        System.out.println("Enter the name of your pet: ");
        String pet = input.nextLine();

        System.out.println("Your band name is: " + city + " " + pet);
    }
}