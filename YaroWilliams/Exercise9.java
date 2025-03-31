import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight: " );
        double weight = input.nextDouble();

        System.out.println("Enter your height: ");
        double height = input.nextDouble();

        int BMI = (int) (weight / (height * height));

        String bodyMass =" ";

        if(BMI <18.5){
            bodyMass="Underweight";
        }else if(BMI >=18.5 && BMI <=24.9){
            bodyMass="Normal weight";
        }else if(BMI >=25 && BMI <=29.9){
            bodyMass="Overweight";
        }else if(BMI > 35){
            bodyMass=" Clinically Obese";
        }    

        System.out.println("Your BMI is: " + BMI+ ", you are " + bodyMass);
        input.close();
        
    }
}
