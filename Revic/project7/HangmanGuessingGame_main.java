package Revic.project7;
import Revic.project7.HangmanArt;
import Revic.project7.HangmanWords;
import java.util.Random;
import java.util.Scanner;
public class HangmanGuessingGame_main {
public static void main(String[] args) {
      HangmanWords wrd = new HangmanWords();
      HangmanArt art = new HangmanArt();
      art.logo();        
     Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String word = wrd.wordList[rd.nextInt(wrd.wordList.length)];
      //  System.out.println(word);
      //  System.out.println(word.length());
        String s = "";
        for(int i=0; i<word.length(); i++){
           s=s+"-";
        }
     //   boolean[] revealed = new boolean[word.length()];

       System.out.println(s);
     int   count =0;
     int lives=7;
while(s.contains("-")&&lives>0){
  System.out.println("Enter a letter you think is in the word");
  Character let = sc.next().toLowerCase().charAt(0);
  //for(int i=0; i<word.length();i++){ }
  if(s.contains(Character.toString(let))){
  System.out.println("You have already gotten this word. Try a different letter. ");
  }
 if(Character.isLetter(let)){
  count =count +1;
  
for(int i=0; i<word.length(); i++){
char c = word.charAt(i);
/*if(let == c&&!revealed[i]){
s = s.substring(0, i)+c+s.substring(i+1);
revealed[i]=true;
break;
}*/
if(c==let){
  s = s.substring(0, i)+c+s.substring(i+1);
//break;
}
}

System.out.println(s);

if(!word.contains(Character.toString(let))&&lives>=0){
  lives =lives -1;
  System.out.println("The letter \""+let +"\""+ " is not in the word.");
  if(lives==6){
    System.out.println(HangmanArt.stage7);
  }
  if(lives==5)
  {
  System.out.println(HangmanArt.stage6);
  }
  else if(lives==4){
    System.out.println(HangmanArt.stage5);

  }
  else if(lives==3){
    System.out.println(HangmanArt.stage4);
    if(s.contains(Character.toString(let))){
  
    }
  }
  else if(lives==2){
    System.out.println(HangmanArt.stage3);

  }
  else if(lives==1){
    System.out.println(HangmanArt.stage2);

  }
  else if(lives == 0){
    System.out.println(HangmanArt.stage1);
    System.out.println("Oops. You lost");
System.out.println("The letter you tried to guess was "+word);
  }

  //break;
  System.out.println("You have "+ lives + " lives left.");
}
if(word.contains(Character.toString(lives)))
System.out.println(count);


 }
 else{
  System.out.println("You had to enter a letter");
 }
      }
      if(!s.contains("-")){
        System.out.println("You won !!");
      }
     // System.out.println(count);
    }
  }