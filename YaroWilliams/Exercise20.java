import java.util.Scanner;
public class Exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("Even Number");
        }else if(num % 2 != 0){
            System.out.println("Odd Number");
        }

        input.close();
    }
}
