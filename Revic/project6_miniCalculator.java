package Revic;
import java.util.Scanner;
import java.lang.reflect.Method;
import java.util.HashMap;
public class project6_miniCalculator {
    public static void logo(){
      System.out.println(
                  " _____________________\n" + //
                  "|  _________________  |\n" + //
                  "| | Codinista   0. | |  .----------------.  .----------------.  .----------------.  .----------------. \n" + //
                  "| |_________________| | | .--------------. || .--------------. || .--------------. || .--------------. |\n" + //
                  "|  ___ ___ ___   ___  | | |     ______   | || |      __      | || |   _____      | || |     ______   | |\n" + //
                  "| | 7 | 8 | 9 | | + | | | |   .' ___  |  | || |     /  \\     | || |  |_   _|     | || |   .' ___  |  | |\n" + //
                  "| |___|___|___| |___| | | |  / .'   \\_|  | || |    / /\\ \\    | || |    | |       | || |  / .'   \\_|  | |\n" + //
                  "| | 4 | 5 | 6 | | - | | | |  | |         | || |   / ____ \\   | || |    | |   _   | || |  | |         | |\n" + //
                  "| |___|___|___| |___| | | |  \\ `.___.'\\  | || | _/ /    \\ \\_ | || |   _| |__/ |  | || |  \\ `.___.'\\  | |\n" + //
                  "| | 1 | 2 | 3 | | x | | | |   `._____.'  | || ||____|  |____|| || |  |________|  | || |   `._____.'  | |\n" + //
                  "| |___|___|___| |___| | | |              | || |              | || |              | || |              | |\n" + //
                  "| | . | 0 | = | | / | | | '--------------' || '--------------' || '--------------' || '--------------' |\n" + //
                  "| |___|___|___| |___| |  '----------------'  '----------------'  '----------------'  '----------------' \n" + //
                  "|_____________________|\n" + //
                  "");
    }
    public static double Addition(double num1, double num2){
      double a =  num1 + num2;
       return a;
    }
    public static double Subtraction(double num1, double num2){
        return num1-num2;
    }
    public static double Multiplication(double num1, double num2){
        return num1*num2;
    }
    public static double Division(double num1, double num2){
        return num1/num2;
    }
    public static void main(String[] args) {
      logo();
     HashMap<Character, String> op = new HashMap<>(); 
     op.put('+',"Addition");
     op.put('-', "Subtraction");
     op.put('x', "Mulltiplication");
     op.put('/', "Division");
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        double num1 = sc.nextDouble();
        System.out.println(op.keySet());
        System.out.println("Pick an operation");
        String operation = sc.next();
        double a = 0.0;

        if((operation.equals("+")||operation.equals("-")||operation.equals("x")||operation.equals("/"))==false){
         System.out.println("Must enter one of these operations: "+ op.keySet());
        }
        else
        {
        System.out.println("Enter second number");
        double num2 = sc.nextDouble();
        
         if(operation.equals("+")){
          a=Addition(num1, num2);
          System.out.println(a);
        }
       else if(operation.equals("-")){
           a=Subtraction(num1, num2);
         System.out.println(a);
        }
       else  if(operation.equals("x")){
         a=Multiplication(num1, num2);
           System.out.println(a);
        }
      else if(operation.equals("/")){
         a=Division(num1, num2); 
           System.out.println(a);
        }
        
     
        System.out.println("Enter \"yes\" if  want to continue with this calculation or otherwise to Start a new calculation ?");
        String cont = sc.next().toLowerCase();
        if(cont.equals("yes")){
        double c = a;
        double num3=0.0;
         while(cont.equals("yes")){
            System.out.println("Enter next number ");
            num3 = sc.nextDouble();
            System.out.println("Pick an operation");
            String operation1 = sc.next();
            if((operation1.equals("+")||operation.equals("-")||operation.equals("x")||operation.equals("/"))==false){
               System.out.println("Must enter ones of these operations: "+ op.keySet());
              }
              else
              {
            if(operation1.equals("+")){
               c=c+num3;
               System.out.println(c);
            }
           else if(operation1.equals("-")){
               c=c-num3;
               System.out.println(c);
            }
           else if(operation1.equals("x")){
               c=c*num3;
               System.out.println(c);
            }
            else if(operation1.equals("/")){
               c=c/num3;
               System.out.println(c);
            }
            else{
               System.out.println("Must enter one of these operations: "+ op.keySet());
            }
            System.out.println("Enter \"yes\" if  want to continue with this calculation or otherwise to Start a new calculation ?");
            cont =sc.next().toLowerCase();
            if(cont.equals("yes")==false){
               System.out.println("Run the code again to start a new calculation");
            }
         }
      }
         }
         else{
            System.out.println("Run the code again to start a new calculation");
         }
        }
   }
}
