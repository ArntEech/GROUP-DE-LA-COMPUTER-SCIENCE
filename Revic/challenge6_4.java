package Revic;
import java.util.Scanner;
public class challenge6_4{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int count=0;
        String ds=String.valueOf(num);
        for (int i =0; i<ds.length();i++){
        count=count+1;
        }
        System.out.println(num+" has "+count+ " digits");
    }
}