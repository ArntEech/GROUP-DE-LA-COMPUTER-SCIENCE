// Write a program that switches the values stored in the variables 'a' and 'b'.
// Your code should work for different inputs. e.g. any value of a and b 

import java.util.Scanner;
public class Exercise4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value for a: ");
        String a = input.nextLine();

        System.out.println("Enter a value for b: ");
        String b = input.nextLine();

        String temp = a;
        a = b;
        b = temp;

        System.out.println("aSwitched - " + a);
        System.out.println("bSwitched - " + b);


        input.close()
    }
    

    
}
