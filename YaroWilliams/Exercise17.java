import java.util.Scanner;
public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the scores seperated by a comma");
        String scores = input.nextLine();
        String[] scoresArrayStr = scores.split(",");
        int[] scoresArray = new int[scoresArrayStr.length];

        int maxScore = 0;

        for(int i=0;i<scoresArrayStr.length;i++){
            scoresArray[i] = Integer.parseInt(scoresArrayStr[i].trim());
        }

        for(int i=0; i<scoresArray.length;i++){
            if(scoresArray[i] > maxScore){
                maxScore =scoresArray[i];
        }
    }
    System.out.println("The highest score is "+maxScore);
    input.close();
}
    
}
