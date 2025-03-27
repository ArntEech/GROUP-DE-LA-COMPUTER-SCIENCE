import java.util.Scanner;
public class Exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();

        for(int i = 0;i<=10;i++){
            System.out.println(num +" x "+i+" = "+(num*i));
        }

        input.close();
    }
}
