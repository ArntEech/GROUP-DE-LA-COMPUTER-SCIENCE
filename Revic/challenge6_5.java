package Revic;
import java.util.Scanner;
public class challenge6_5 {
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter a word: ");
String word=sc.nextLine();
System.out.print("the reversed word is ");
for (int i=word.length()-1; i>=0; i--){
    char c = word.charAt(i);
    System.out.print(c);
}
System.out.println();
    }
    
}
