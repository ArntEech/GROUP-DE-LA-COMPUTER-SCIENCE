import java.util.Scanner;
public class Exercise7 {
    public static final int MAX_AGE = 90;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your current age? ");
        int age = input.nextInt();// enter age
        int yearsLeft = MAX_AGE - age;
        int daysLeft = yearsLeft * 365;
        int weeksLeft = yearsLeft * 52;
        int monthsLeft = yearsLeft * 12;
        System.out.println("You have " + daysLeft + " days, " + weeksLeft + " weeks, and " + monthsLeft + " months left.");
    }
}
