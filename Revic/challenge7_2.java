package Revic;
import java.util.Scanner;
public class challenge7_2 {
    public static int Scanner(){
        Scanner sc= new Scanner(System.in);
        int number =sc.nextInt();
        return number;
    }
    
    public static String  PrimeChecker(int number){
if (number % 2!=0){
    return "Number is prinme";
}
else {
    return "Number is not prime";
}
    }
    public static void main(String[] args) {
        System.out.println("Which number do you want to check ?");

        System.out.println(PrimeChecker(Scanner()));
    }
   
}
