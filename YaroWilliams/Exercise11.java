import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Welcome message
        System.out.println("Hello!, Welcome to perfected Pizza!");

        System.out.println("What size of pizza would you like to order? (S/M/L)");
        String size = input.nextLine();

        System.out.println("Do you want pepperoni? (Y/N)");
        String pepperoni = input.nextLine();

        System.out.println("Do you want extra cheese? (Y/N)");
        String cheese = input.nextLine();

        int bill = 0;

        if(size.equalsIgnoreCase("S")){
            bill += 15;
            if(pepperoni.equalsIgnoreCase("Y")){
                bill += 2;
            }if(cheese.equalsIgnoreCase("Y")){
                bill += 1;
            }
        }else if(size.equalsIgnoreCase("M")){
            bill += 20;
            if(pepperoni.equalsIgnoreCase("Y")){
                bill += 3;
            }if(cheese.equalsIgnoreCase("Y")){
                bill += 1;
            }
        }else if(size.equalsIgnoreCase("L")){
            bill += 25;
            if(pepperoni.equalsIgnoreCase("Y")){
                bill += 3;
            }if(cheese.equalsIgnoreCase("Y")){
                bill += 1;
            }
        }

        System.out.println("Your bill is $ "+bill);

input.close();
    }
}
