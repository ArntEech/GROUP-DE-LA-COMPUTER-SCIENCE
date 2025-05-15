package Revic;
import java.util.Random;
import java.util.Scanner;
public class project4_passwordGenerator {
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
Random rm =new Random();
System.out.println("How many numbers do you want your password to have ?");
int num=sc.nextInt();
System.out.println("How many symbols do you want to include ?");
int sym=sc.nextInt();
System.out.println("How many letters do you want your password to have ?");
int let=sc.nextInt();
char [] numbers ={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
char[] symbols ={'!', '#', '$', '%', '&', '(', ')', '*', '+'};
char[] letters ={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

char[] numa= new char[num];
char[] syma=new char[sym];
char[] leta=new char[let];
// for loops to pick random numbers and store in empty array
for(int i=0; i<=num-1; i++){
    char number=numbers[rm.nextInt(numbers.length)];
    numa[i]=number;
}
for(int i=0; i<sym; i++){
    char symbol=symbols[rm.nextInt(symbols.length)];
    syma[i]=symbol;
}

for(int i=0; i<=let-1; i++){
    char letter=letters[rm.nextInt(letters.length)];
    leta[i]=letter;
}


//creating an empty array to store all the random numbers generated
char[] total = new char[num+let+sym];
for(int i=0; i<num; i++){
    total[i]=numa[i];

}
for(int j=num; j<num+sym; j++){
    total[j]=syma[j-num];
}
for(int k=num+sym; k<(num+let+sym); k++){
    total[k]=leta[k-(num+sym)];
}
for(int i=0; i<num+let+sym;i++){
}
System.out.print("Your generated password is: \n");
for(int i=0; i<total.length;i++){
    int rd= rm.nextInt(total.length);
    char name=total[i];
    total[i]=total[rd];
    total[rd]=name;}
for(int i=0; i<total.length; i++){
    System.out.print(total[i]);
}

}