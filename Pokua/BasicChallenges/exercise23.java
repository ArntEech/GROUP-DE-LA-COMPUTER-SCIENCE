package BasicChallenges;

import java.util.Scanner;

public class exercise23 {

    public void digitLength() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        String num = Integer.toString(number);
        int length = num.length();

        System.out.printf("The number %d has %d digits", number, length);

    }


    public static void main(String[] args){
        exercise23 obj = new exercise23();

        obj.digitLength();
    }
}