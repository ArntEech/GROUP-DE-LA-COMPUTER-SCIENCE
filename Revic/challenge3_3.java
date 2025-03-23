package Revic;
import java.util.Scanner;
public class challenge3_3 {
    
    public static void main(String[] args) {
     System.out.println("Welcome to Papa's Pizza");
Scanner sc = new Scanner(System.in);
System.out.println("What size pizza do you want ? S , M or L");
String size=sc.next();
System.out.println("Do you want pepperoni ? Y or N");
String flavor=sc.next();
System.out.println("Do you want extra cheese ? Y or N");
String cheese=sc.next();
int spizza=15;
int mpizza=20;
int lpizza=25;
int lmflavor=3;
int sflavor=2;
int echeese=1;
int pprize=0;
int fprize=0;
int pcheese=0;
if (size.equals("L")){
    pprize=lpizza;
}
else if (size.equals("S")){
    pprize= spizza;
}
else if (size.equals("M")){
    pprize = mpizza;
}
if ((size.equals("L") || size.equals("M"))&&(flavor.equals("Y"))){
    fprize=lmflavor;
}
else if (size.equals("S")&&flavor.equals("Y")){
    fprize=sflavor;
}
if (cheese.equals("Y")){
    pcheese=echeese;
}
int prize=pprize+fprize+pcheese;

System.out.println("Your bill is: "+ prize);
    }
    
}
