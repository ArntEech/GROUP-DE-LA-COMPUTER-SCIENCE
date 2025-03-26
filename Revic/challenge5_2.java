package Revic;
import java.util.Scanner;
public class challenge5_2 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many scores are there ? ");
    int size=sc.nextInt();
    int[] num= new int[size];
    System.out.println("Enter the scores (seperated by a space) : ");

    for(int i=0; i<size; i++){
    num[i]=sc.nextInt();
    }
 
int max=0;
for(int i=0; i<size-1; i++){
if(num[i]>num[i+1]&&num[i]>max){
    max=num[i];
}
 if(num[size-1]>max){
    max=num[size-1];
}

}
System.out.println("the maximum score is " +max);

    }
    
}
