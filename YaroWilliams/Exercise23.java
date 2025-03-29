import java.util.Scanner;
public class Exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        StringBuilder build = new StringBuilder();
        build.append(num);

        int numOfDigits = build.length();
        System.out.println("The number "+num+" has "+numOfDigits+" digits");
    }
}
