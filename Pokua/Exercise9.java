import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in kg: ");
        double weight = input.nextDouble();

        System.out.println("Enter your height in m: ");
        double height = input.nextDouble();

        double bmi = weight/Math.pow(height, 2);
        
        if (bmi<18.5){
            System.out.println("Your BMI is "+bmi+", you are underweight");
        } else if (bmi<=24.9 && bmi>=18.5){
            System.out.println("Your BMI is "+bmi+", your weight is normal");
        }else if (bmi<=29.9 && bmi>=25){
            System.out.println("Your BMI is "+bmi+", you are overweight");
        }else if(bmi<=34.9 && bmi>=30){
            System.out.println("Your BMI is "+bmi+", you are obese");
        }else{
            System.out.println("Your BMI is "+bmi+", you are clinically obese");
        }

        input.close();
    }
    
}
