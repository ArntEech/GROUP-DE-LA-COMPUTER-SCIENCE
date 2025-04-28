package Revic;
import java.util.Scanner;
public class challenge7_1{
    public static  int ppc =5;
    public static Double width(){
    Scanner sc = new Scanner(System.in);
    System.out.println("What is the width of the wall ?");
    Double width =sc.nextDouble();
    return width;
    }
    public static Double height(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the height of the wall ?");
Double height =sc.nextDouble();
return height;
    }
    public static int cannum(double height, double width, int ppc){
      double cannum=  height*width/ppc;
      return (int) cannum;
    }
    public static void main(String[] args) {
       System.out.println(cannum(height(), width(), ppc));
    }
}