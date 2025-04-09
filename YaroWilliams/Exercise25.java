import java.util.Scanner;
public class Exercise25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int coverage = 5;

        System.out.println("Enter the height of your wall");
        int height = input.nextInt();

        System.out.println("Enter the width of your wall");
        int width = input.nextInt();

        int numOfCans = (int) Math.ceil(((height * width) / coverage)) ;

        System.out.println("You need "+numOfCans + " cans of paint to paint the wall");
        
    }
}
