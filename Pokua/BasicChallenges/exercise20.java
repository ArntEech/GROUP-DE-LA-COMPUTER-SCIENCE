package BasicChallenges;

import java.util.Scanner;

public class exercise20 {

    public void checker(){
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if (number%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args){

        exercise20 obj = new exercise20();

        obj.checker();
    }
}
