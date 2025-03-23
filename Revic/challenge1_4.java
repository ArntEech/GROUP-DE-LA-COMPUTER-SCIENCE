package Revic;
import java.util.Scanner;
public class challenge1_4 {

public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
    System.out.println("a="+a);
    int b = sc.nextInt();
    System.out.println("b="+b);    
    int c = a; 
     a = b;      
    b = c;   

    System.out.println("After Swapping: a = " + a + ", b = " + b);
}
}
