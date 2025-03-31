import java.util.ArrayList;
import java.util.Scanner;

public class exercise24 {

    public void table() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String n = input.nextLine();

        ArrayList<String> letters = new ArrayList<String>();

        for(int i = n.length() - 1; i>=0 ;i--){
            letters.add(String.valueOf(n.charAt(i)));
        }

        String arraylist = String.join("", letters);
        System.out.println(arraylist);
    }


    public static void main(String[] args){
        exercise24 obj = new exercise24();

        obj.table();
    }
}
