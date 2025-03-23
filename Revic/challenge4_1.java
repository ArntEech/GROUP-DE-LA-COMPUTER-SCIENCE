package Revic;
import java.util.Random;
public class challenge4_1 {
    public static void main(String[] args) {   
    Random rm = new Random();
    int number=rm.nextInt(2);
   // System.out.println(number);
    if(number==0){
        System.out.println("Heads");
    }
    else{
        System.out.println("Tails");
    }
    
    }
}
