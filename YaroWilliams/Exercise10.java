
import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user to enter a year.
        System.out.println("Enter a year: ");
        int year = input.nextInt();

        // Checking if it is a leap year
        if(year % 4 ==0 && year % 400 ==0){
            System.out.println("The year "+year+ " is a Leap year!");
        }else if (year % 4 ==0 && year % 100 !=0) {
            System.out.println("The year "+year+ " is a Leap year!");
        } else{
            System.out.println("The year "+year+" is not a Leap year!");
        }
        input.close();

    }
}





