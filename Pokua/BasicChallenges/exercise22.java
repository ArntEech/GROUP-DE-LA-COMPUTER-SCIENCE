package BasicChallenges;

import java.util.Scanner;

public class exercise22 {

    public void table() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = input.nextInt();

        for(int i = 1; i<=10 ;i++){
            int res = n*i;
            System.out.printf("%d x %d = %d \n",n,i,res);
        }
    }


    public static void main(String[] args){
        exercise22 obj = new exercise22();

        obj.table();
    }
}