import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        // Exercise4 --Swapping Variables--
        Scanner input = new Scanner(System.in);
        System.out.println("a: ");
        // Take input from the user
        int a = input.nextInt();

        System.out.println("b: ");
        int b = input.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // swapping a and b by introducing a third variable c

        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping: a = " + a + ", b = " + b);
        input.close();
    }
}