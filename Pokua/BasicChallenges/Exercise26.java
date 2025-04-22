package BasicChallenges;

import java.util.Scanner;

public class Exercise26 {

    public void primeChecker(int n){
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            System.out.println(i);
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        Exercise26 obj = new  Exercise26();

        obj.primeChecker(num);

        input.close();
    }
}
