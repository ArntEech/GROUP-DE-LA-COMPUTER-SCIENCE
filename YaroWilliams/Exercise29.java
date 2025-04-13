import java.util.HashMap;
import java.util.Scanner;
public class Exercise29 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        Boolean isLeap;
        HashMap<Integer, Integer> months = new HashMap<>();
        months.put(1, 31);
        months.put(2, 28);
        months.put(3, 31);
        months.put(4, 30);
        months.put(5, 31);
        months.put(6, 30);
        months.put(7, 31);
        months.put(8, 31);
        months.put(9, 30);
        months.put(10, 31);
        months.put(11, 30);
        months.put(12, 31);

        HashMap<Integer, String> monthNames = new HashMap<>();
        monthNames.put(1, "January");
        monthNames.put(2, "February");
        monthNames.put(3, "March");
        monthNames.put(4, "April");
        monthNames.put(5, "May");
        monthNames.put(6, "June");
        monthNames.put(7, "July");
        monthNames.put(8, "August");
        monthNames.put(9, "September");
        monthNames.put(10, "October");
        monthNames.put(11, "November");
        monthNames.put(12, "December");

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        System.out.println("Enter a month: ");
        System.out.println("Hint!, Jan - 1, Feb -2 , March -3 , April - 4, May -5, June -6, e.t.c");
        int month = input.nextInt();

        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeap = true;
        } else {
            isLeap = false;
        }

        if(isLeap == true){
            months.replace(2, 29);
          int numOfdays = months.get(month);
          String monthName = monthNames.get(month);
          System.out.println(monthName+" has "+numOfdays+ " days.");
        }else{
            months.replace(2, 28);
            int monthdays = months.get(month);
            String monthName = monthNames.get(month);
            System.out.println(monthName+" has "+monthdays+" days.");
        }
       
    }
}
