package BasicChallenges;

import java.util.Scanner;

public class exercise17 {
    
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input a list of student heights: ");
        String[] scores = input.nextLine().split(" ");

        int max = 0;
        for (String  score: scores){
            int s = Integer.parseInt(score.trim());
            if (s > max){
                max = s;
            }
        }

        System.out.println("The Highest score in the class is: "+ max);

        input.close();
    }
    
}
