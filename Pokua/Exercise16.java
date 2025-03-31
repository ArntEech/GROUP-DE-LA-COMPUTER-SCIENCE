import java.util.Scanner;

public class Exercise16 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input a list of student heights: ");
        String[] heights = input.nextLine().split(" ");
        int sum = 0;

        for (String  height: heights){
            int h = Integer.parseInt(height.trim());
            sum += h;
        }

        int average = Math.round((sum / heights.length));

        System.out.println("The average is " + average);


        input.close();
    }
}
