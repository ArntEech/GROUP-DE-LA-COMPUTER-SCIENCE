package Revic.Exercise31;
import java.util.ArrayList;
import java.util.HashMap;
public class Data {
    
    public ArrayList<Question> liste(){
        ArrayList<Question> list = new ArrayList<>();

        Question qu1 = new Question("A slug's blood is green.", "True");
        Question qu2 = new Question("The loudest animal is the African Elephant.", "False");
        Question qu3 = new Question("Approximately one quarter of human bones are in the feet.", "True");
        Question qu4 = new Question("The total surface area of a human lungs is the size of a football pitch.", "True");
        Question qu5 = new Question("In West Virginia, USA, if you accidentally hit an animal with your car, you are free to take it home to eat.","True");
        Question qu6 = new Question("In London, UK, if you happen to die in the House of Parliament, you are entitled to a state funeral.", "False");
        Question qu7 = new Question("It is illegal to pee in the Ocean in Portugal.", "True");
        Question qu8 = new Question("You can lead a cow down stairs but not up stairs.", "False");
        Question qu9 = new Question("Google was originally called 'Backrub'.", "True");
        Question qu10 =new Question("Buzz Aldrin's mother's maiden name was 'Moon'.", "True");
        Question qu11= new Question("No piece of square dry paper can be folded in half more than 7 times.", "False");
        Question qu12 = new Question("A few ounces of chocolate can to kill a small dog.", "True");
    

        list.add(qu1);
        list.add(qu2);
       // list.add(qu2);
        list.add(qu3);
        list.add(qu4);
        list.add(qu5);
        list.add(qu6);
        list.add(qu7);
        list.add(qu8);
        list.add(qu9);
        list.add(qu10);
        list.add(qu11);
        list.add(qu12);

//System.out.println(list);
return list;
    }
  
}
