package Revic.Exercise31;

import java.util.List;
import java.util.Scanner;

//import java.util.ArrayList;
public class QuizBrain {  
private int currentQuestionIndex;
private int score;
private List<Question> QuestionList;
public QuizBrain(List<Question> questions) {
    this.QuestionList = questions;
    this.currentQuestionIndex = 0;
    this.score = 0;
}
public boolean stillHasQuestions(){
    if(currentQuestionIndex==12){
        return false;
    }
    else{
        return true;
    }
}

public void nextQuestion(){
  /*   Data dat = new Data();
    for(int i = 0; i<dat.liste().size(); i++){
    System.out.println(dat.liste().get(i).getText()+"True or False");
    }
    QuestionList.get(currentQuestionIndex);*/
    Question current = QuestionList.get(currentQuestionIndex);
    System.out.println(current.getText() + " (True/False)?");

    Scanner scanner = new Scanner(System.in);
    String userAnswer = scanner.nextLine();

    checkAnswer(userAnswer, current.getAnswer());
    currentQuestionIndex++;
        }
        
/*public void checkAnswer(String choose, String cf){
    Scanner sc = new Scanner(System.in);
  //  String choose = sc.next();
    Data dat = new Data();
   
    for(int i = 0; i<dat.liste().size(); i++){
        if(choose.equalsIgnoreCase(dat.liste().get(i).getAnswer())){
            System.out.println("You got it right ");
            score=score+1;
        }
        else if(choose.equalsIgnoreCase("True")||choose.equalsIgnoreCase("False")&&!choose.equalsIgnoreCase(dat.liste().get(i).getAnswer())){
            System.out.println("You got it wrong \n"+"The right answer is "+dat.liste().get(i).getAnswer());
        }
        else{
            System.out.println("You had to type an answer: True or False ");
        }
        currentQuestionIndex= currentQuestionIndex-1;
    }
}*/
public void checkAnswer(String userAnswer, String correctAnswer) {
    if (userAnswer.equalsIgnoreCase(correctAnswer)) {
        System.out.println("Correct!");
        score++;
    } else {
        System.out.println("Wrong. The correct answer is: " + correctAnswer);
    }

    System.out.println("Score: " + score + "/" + (currentQuestionIndex + 1));
}


  
}

