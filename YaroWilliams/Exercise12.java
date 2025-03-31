import java.util.Scanner;
public class Exercise12 {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Hey there, Welcome to the love cirlcle, we calculate the love compatibility between you and your patner!");
        System.out.println(" ");

        System.out.println("Enter the first name:");
        String name1 = input.nextLine().toLowerCase();

        System.out.println("Enter the second name:");
        String name2 = input.nextLine().toLowerCase();

        String combinedNames = name1 + name2;

        int trueCount = countMatches(combinedNames, 't')+
                        countMatches(combinedNames, 'r')+
                        countMatches(combinedNames, 'u')+
                        countMatches(combinedNames, 'e');

        int loveCount = countMatches(combinedNames, 'l')+
                        countMatches(combinedNames, 'o')+
                        countMatches(combinedNames, 'v')+
                        countMatches(combinedNames, 'e');

        int compatScore = (trueCount + loveCount) * 10;

        if(compatScore < 10 || compatScore > 90){
            System.out.println("Your love compatibility is "+compatScore+"%. You go together like coke and mentos.");
        }else if(compatScore >=40 && compatScore<= 50){
            System.out.println("Your love compatibility is "+compatScore+"%. You are alright together.");
        }else{
            System.out.println("Your love compatibility is "+compatScore+"%");
        }
        input.close();
    }
    public static int countMatches(String text1, char letter){
        int count = 0;
        for(char i: text1.toCharArray()){
            if(i == letter){
                count++;
            }
        }
        return count;
    }    
}

