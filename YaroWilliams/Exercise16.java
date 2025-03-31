import java.util.Scanner;
public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int avgHeigts = 0;
        int sumOfHeights =0;

        System.out.println("Enter the heights of the students, seperated by a comma:");
        String heights = input.nextLine();
        String[] heightsArrayStr = heights.split(",");
        double[] heightsArray = new double[heightsArrayStr.length];

        for (int i = 0; i < heightsArrayStr.length; i++) {
            heightsArray[i] = Double.parseDouble(heightsArrayStr[i].trim());
        }

        for(int i=0; i<heightsArray.length;i++){
            sumOfHeights += heightsArray[i];
            avgHeigts = sumOfHeights/heightsArray.length;
        }
        System.out.println(avgHeigts);
    }
}
