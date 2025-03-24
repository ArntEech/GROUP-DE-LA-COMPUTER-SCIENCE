import java.util.Random;
import java.util.Scanner;
public class Exercise13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Flip Da Coin!");
        System.out.println("1. Flip Da Coin");
        System.out.println("2. Exit");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        if(choice == 1){
            Random random = new Random();
            int coin = random.nextInt(2);
            if(coin == 0){
                System.out.println("Heads");
            }else{
                System.out.println("Tails");
            }
        }else if(choice == 2){
            System.out.println("Exiting");
        }else{
            System.out.println("Invalid input, please enter 1 or 2");
        }

        input.close();

    }

    
}
