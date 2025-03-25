package Revic;
import java.util.Scanner;
public class challenge4_3 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
 String[][] name= {{"'⬜'","'⬜'","'⬜'"},
                   {"'⬜'","'⬜'","'⬜'"},
                   {"'⬜'","'⬜'","'⬜'"}
                  };
 System.out.println("where do you want to put the treasure ?");
 int b =sc.nextInt();
 int a=sc.nextInt();
 
 name[a][b]="' X'";
 for (int i=0; i<3; i++){
    for(int j=0; j<3; j++){
    System.out.print(name[i][j]+"   ");
    }
    System.out.println();
    System.out.println();

 } 
    }
    
}
