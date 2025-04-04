import java.util.Scanner;

public class Exercise10{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }

        input.close();
    }

}
