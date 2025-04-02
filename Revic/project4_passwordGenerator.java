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

//char number=numbers[rm.nextInt(num)];
//char letter=letters[rm.nextInt(let)];
//char symbol=symbols[rm.nextInt(sym)];

//Initializing an empty array to store random elements at specific sizes(indicated by the user)
char[] numa= new char[num];
char[] syma=new char[sym];
char[] leta=new char[let];
// for loops to pick random numbers and store in empty array
for(int i=0; i<=num-1; i++){
    char number=numbers[rm.nextInt(numbers.length)];
    numa[i]=number;
 //   System.out.print(numa[i]);
}
//System.out.println();
for(int i=0; i<sym; i++){
    char symbol=symbols[rm.nextInt(symbols.length)];
    syma[i]=symbol;
   //System.out.print(syma[i]);
}
//System.out.println();

for(int i=0; i<=let-1; i++){
    char letter=letters[rm.nextInt(letters.length)];
    leta[i]=letter;
    //System.out.print(leta[i]);
}

///System.out.println();
=======
char[] numa= new char[num];
char[] syma=new char[sym];
char[] leta=new char[let];
for(int i=0; i<=num-1; i++){
    char number=numbers[rm.nextInt(num)];
    numa[i]=number;
    //System.out.print(number);
}
for(int i=0; i<sym; i++){
    char symbol=symbols[rm.nextInt(sym)];
    syma[i]=symbol;
    //System.out.print(number);
}
for(int i=0; i<=let-1; i++){
    char letter=letters[rm.nextInt(let)];
    leta[i]=letter;
    //System.out.print(number);
}

//System.out.println(number);
/*System.out.print(numa);
System.out.print(syma);
System.out.print(leta);
System.out.println();*/
//System.out.println("the combined elements are: ");
//creating an empty array to store all the random numbers generated
char[] total = new char[num+let+sym];
for(int i=0; i<num; i++){
    total[i]=numa[i];
   // System.out.print(total[i]);

char[] total = new char[num+let+sym];
for(int i=0; i<num; i++){
    total[i]=numa[i];
  //  System.out.println(total[i]);

}

for(int j=num; j<num+sym; j++){
    total[j]=syma[j-num];
   // System.out.print(total[j]);
  //  System.out.println(total[j]);

}
for(int k=num+sym; k<(num+let+sym); k++){
    total[k]=leta[k-(num+sym)];
  //  System.out.print(total[k]);

}
//System.out.println();
for(int i=0; i<num+let+sym;i++){
  //  System.out.print(total[i]);

}
//System.out.println();

//System.out.println("");
//System.out.println(total[11]);
//System.out.println(total.length);
//System.out.print("Your generated password is: \n");
/*char[] all = new char[total.length];
for (int i=0; i<total.length; i++){
    char fin =total[rm.nextInt(total.length)];
//all[i]= fin;
//System.out.print(all[i]);

System.out.print(fin);

}*/
//for(int i=0;)
/*System.out.println(letter);
System.out.println(symbol);*/
System.out.print("Your generated password is: \n");
for(int i=0; i<total.length;i++){
    int rd= rm.nextInt(total.length);
    char name=total[i];
    total[i]=total[rd];
    total[rd]=name;
}

//System.out.println();
for(int i=0; i<total.length; i++){
    System.out.print(total[i]);
}
/*System.out.println();
System.out.println(total.length);*/

    //System.out.println(total[k]);

}
/*for(int i=0; i<num+let+sym;i++){
    System.out.print(total[i]);

}*/
//System.out.println("");
//System.out.println(total[11]);
//System.out.println(total.length);
System.out.print("Your generated password is: ");
char[] all = new char[total.length];
for (int i=0; i<total.length; i++){
    char fin =total[rm.nextInt(total.length)];
all[i]= fin;
System.out.print(all[i]);

System.out.print(fin);

}
//for(int i=0;)
/*System.out.println(letter);
System.out.println(symbol);*/
    }
    
}