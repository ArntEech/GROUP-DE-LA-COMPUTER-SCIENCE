import java.util.Scanner;

public class Exercise7 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is your age? : ");
        int age = input.nextInt();

        if (age<=90){
            int yearsleft = 90 - age;

            int months = 12*yearsleft;
            int weeks =  52*yearsleft;
            int days = 365*yearsleft;

            System.out.printf("You have %d days, %d weeks and %d months left", days,weeks, months );


        }else{
            System.out.println("You ain't gonna live that long bruh, according to this system, not me *wink wink*!");
        }

        input.close();

    }
}