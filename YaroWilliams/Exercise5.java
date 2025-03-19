import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Exercise5 --Taking User Input--

        System.out.println("Enter a number: ");
        System.out.println("NB: The number must be greater than 0");
        int number = input.nextInt(); // Take input from the user
        int digitSum =sumOfDigits(number); // Calls the sumOfDigits method and stores the result in digitSum
        System.out.println("The sum of the digits of the number is: " + digitSum); // Prints the result

    }

    public static int sumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10; // Adds the last digit of the num to sum(NB: num % 10 gives the last digit of the number)
            num /=10;
             // Removes the last digit from the number(NB: this is possible beacuse java keeps only the whole number after division using "/" operator)
        }
        return sum;
    }

}
