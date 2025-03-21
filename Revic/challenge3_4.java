package Revic;
import java.util.Scanner; 

public class challenge3_4 {
    public static void main(String[] args) {
        
 Scanner sc= new Scanner(System.in);
    System.out.println("What is your name ?");
   String name1= sc.nextLine();
   System.out.println("What is his/her name ?");
 String   name2 =sc.nextLine();
 String names  =name1 +name2;
 String name=names.toUpperCase();
 //System.out.println(name);
 int count1=0;
 int count2=0;
 for(int i=0; i<name.length(); i++){
    char a=name.charAt(i);
    if(a=='T'||a=='R'||a=='U'||a=='E'){
        count1++;
    }
    if(a=='L'||a=='O'||a=='V'||a=='E'){
        count2++;
    }
    }
   String count3=String.valueOf(count1);
   String count4=String.valueOf(count2);
   String counts=count3+count4;
   System.out.println("Your score is: "+ counts+"%");

   int count= Integer.parseInt(counts);
   
   if (count<10||count>90){
    System.out.println("You go together like coke and mentos");
   }
   else if (count>=40 && count<=50){
    System.out.println("You are alright together.");
   }
   else{
    System.out.println("");
   }
 //System.out.println(name);
 //System.out.println(count1);
 //System.out.println(count2);



    }

}
    