package BasicChallenges;

import java.util.Scanner;

public class Exercise29{

    public boolean isLeapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }

    }

    public int daysInMonth(int year, int month) {

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year) && month == 2) {
                return 29;
        }

        return monthDays[month - 1];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month: ");
        int month = input.nextInt();

        Exercise29 obj = new Exercise29();
        int days = obj.daysInMonth(year, month);

        System.out.println("Days in the month: " + days);

        input.close();
    }
}

