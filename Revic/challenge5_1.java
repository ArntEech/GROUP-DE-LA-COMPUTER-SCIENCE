package Revic;
import java.util.Scanner;
public class challenge5_1 {
    public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("How many heights do you want to find it's average ?");
    int size=sc.nextInt();
    int[] num= new int[size];
    System.out.println("Enter your list of heights (seperated by a space) : ");

    for(int i=0; i<size; i++){
    num[i]=sc.nextInt();
    }
 /*    for(int i=0; i<size; i++){
    System.out.print(num[i]+" ");
}*/
int sum =0;
for(int i=0; i<size; i++){
    sum = sum+num[i];
}
System.out.println();

double averageD =sum/size;
int average = (int)averageD;
System.out.println("the average height  is: "+average);

    }
}
