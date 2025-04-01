import java.util.Scanner;
public class Project2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
    System.out.println("Welcome to the Tip Calculator");

    System.out.println("What was the total bill? ");
    double bill = input.nextDouble();

    System.out.println("What percentage of tip would you like to give? 10,12 or 15? ");
    int tipPercentage = input.nextInt();

    System.out.println("How may people are to split the bill? ");
    int numOfPeople = input.nextInt();

    double totalBill = (tipPercentage / 100) + bill;
    double billPerPerson = totalBill / numOfPeople;

    String formattedBill = String.format("%.2f", billPerPerson);    

    System.out.println("Each person should pay : $"+formattedBill);

    input.close();
    }
}