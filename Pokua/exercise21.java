import java.util.Scanner;

public class exercise21 {

    public void sum(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = input.nextInt();

        int sum = 0;

        for(int i=0; i<=num;i++){
            sum+=i;
        }

        System.out.println("The sum is "+sum);
    }

    public static void main(String[] args){
        exercise21 obj = new exercise21();

        obj.sum();
    }
}
