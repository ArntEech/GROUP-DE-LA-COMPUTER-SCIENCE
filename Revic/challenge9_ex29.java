package Revic;
import java.util.Scanner;
//import javax.swing.plaf.synth.SynthStyle;

public class challenge9_ex29 {
    public static boolean  isLeap(int year){
  if (year % 4 == 0)
    if (year % 100 == 0)
      if (year % 400 == 0)
            return true;
      else{
            return false;
      }
    else{
     return true;
    }
  else{
   return false;
}

    }
    
  
public static int  daysInMonth(int year, int month){
    int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    if(isLeap(year)){
monthDays[1]=29;
System.out.println(monthDays[month-1]);
    }
 else{
    System.out.println( monthDays[month-1]);
 }
 return monthDays[month-1];
}

//Scanner sc = new Scanner(System.in);
//int year =sc.nextInt();
//int month = sc.nextInt();
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter year and month numbers");
int  year =sc.nextInt();
 int  month =sc.nextInt();

    daysInMonth(year, month );
}
    }

