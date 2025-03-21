package Revic;
import java.util.Scanner;
public class challenge3_4 {
   public static void main (String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("What is your name ?");
String name1=sc.next();
System.out.println("What is his/her name?");
String name2=sc.next();
int countT =0;
int countR=0;
int countU=0;
int countE=0;
int countL=0;
int countO=0;
int countV=0;
//int countE=0;
for (int i=0; i<name1.length(); i++){
    char u=Character.toUpperCase(name1.charAt(i));
if (u=='T'){
   countT=countT+1;
}
if (u=='R'){
   countR=countR+1;
}if (u=='U'){
   countU=countU+1;
}if (u=='E'){
   countE=countE+1;
}if (u=='L'){
   countL=countL+1;                                              
}if (u=='O'){
   countO=countO+1;
}if (u=='V'){
   countV=countV+1;
}


   }
   System.out.println("For you:                                                                                                                                                                                                                                                                                                                                                                                             ");
System.out.println("T occurs "+countT+" times");
System.out.println("R occurs "+countR+" times");
System.out.println("U occurs "+countU+" times");
System.out.println("E occurs "+countE+" times");
System.out.println("L occurs "+countL+" times");
System.out.println("O occurs "+countO+" times");
System.out.println("V occors "+countV+" times");


countT =0;
countR=0;
 countU=0;
 countE=0;
 countL=0;
 countO=0;
  countV=0;
   for (int i=0; i<name2.length(); i++){
      char u= Character.toUpperCase(name2.charAt(i));
  if (u=='T'){                                                                                                                        
     countT=countT+1;
  }
  if (u=='R'){
     countR=countR+1;
  }if (u=='U'){
     countU=countU+1;
  }if (u=='E'){
     countE=countE+1;
  }if (u=='L'){
     countL=countL+1;
  }if (u=='O'){
     countO=countO+1;
  }if (u=='V'){
     countV=countV+1;
  }

     }
     System.out.println("For him/her: ");
System.out.println("T occurs "+countT+" times");
System.out.println("R occurs "+countR+" times");
System.out.println("U occurs "+countU+" times");
System.out.println("E occurs "+countE+" times");
System.out.println("L occurs "+countL+" times");
System.out.println("O occurs "+countO+" times");
System.out.println("V occors "+countV+" times");
}
}