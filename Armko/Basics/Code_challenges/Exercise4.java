import java.util.Scanner;
public class Exercise4{
   
    public static void main(String[] args) {
         int age = 23;
        int new_age = 45;
        System.out.println("Befor swaping");
        System.out.println("Age = " + age);
        System.out.println("New age = " + new_age);
        System.out.println("After swapping");

        int swap = age;
        age = new_age;

        System.out.println("Age = " + age);
        System.out.println("New age = " + swap);



         // Some side hustle

    Scanner again = new Scanner(System.in);
    System.out.println("Enter text1:");
   // String read = again.nextLine();
    System.out.println("Enter text2:");
    String read2 = again.nextLine();
    System.out.println("The first text you entered was " );
    System.out.println("The first text you entered was " + read2);

    System.out.println("Altogether is ");
    System.out.println( read2);



        
    }

   
}