
package Revic;

class Challenge1{
    public static void main(String args[]){
        char grade ='C';
        switch(grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
             System.out.println("Good");
             break;
            case 'C':
            System.out.println("Average");
              break;   
            default:
             System.out.println("Invalid");
            
        }
    }
}
/*import java.util.Scanner;//import the utility that accepts user input
class userinput{
    public static void main(String[] args) {
       String name;
        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter your name:");
        name=userInput.nextLine();
        System.out.println("name:"+name);
        userInput.close();
        int p1=24;
        int p2=3; 
        int total;
        total= p1+p2;
        System.out.println(total);
       //LOGICAL OPERATORS
        int a=5;
         int b=6;
         boolean rOne, rTwo;
         rOne=(a<b)&&(b>a);
         rTwo=(a<b)||(a>b);
         System.out.println(rOne);
         System.out.println(rTwo);
        //DECISION MAKING
         //IF
        import java.util.Scanner;
         int pascde=2514;
         int userinput;
         try (Scanner input = new Scanner(System.in)) {
            userinput=input.nextInt();
        }
         if(userinput==pascde){
            System.out.println("Verification complete");
         }
         System.out.println("End of process");
    }
}*/
/*import java.util.Scanner;
class userinput{
    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        if(number>0){
            System.out.println("Verification complete");
        }
        else if(number<0){System.out.println("Failed");}
        else{System.out.println("It is okay");
        }
    }
}*/