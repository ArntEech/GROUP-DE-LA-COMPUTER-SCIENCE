package BasicChallenges;

import java.util.Random;
import java.util.Scanner;

public class Exercise14{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a list of names: ");
        String[] list = input.nextLine().split(" ");

        Random rand = new Random();

        String name = list[rand.nextInt(list.length)];

        System.out.println(name + " is going to buy the meal today!");

        input.close();
    }

}
