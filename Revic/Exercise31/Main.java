package Revic.Exercise31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Data dat = new Data();
     QuizBrain brain = new QuizBrain(dat.liste());
   for (int i=0; i<dat.liste().size(); i++){
    brain.nextQuestion();

   }
    }
}
