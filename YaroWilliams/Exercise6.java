import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height in m");
        double height = input.nextDouble();
        System.out.println("Enter your weight in kg");
        double weight = input.nextDouble();

        int BMI = (int)(weight / (height * height));
        System.out.println("Your Body Mass Index is: " + BMI);
    }
}
