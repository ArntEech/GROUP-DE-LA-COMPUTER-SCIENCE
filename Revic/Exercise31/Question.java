package Revic.Exercise31;

public class Question {
    private String text;
    private String answer;
    public Question(String text, String answer){
      this.text = text;
      this.answer = answer;
    }
    public String getText(){
      return text;
    }
    public String getAnswer(){
      return answer;
    }
    @Override
    public String toString() {
        return "Question: " + text + "  Answer: " + answer;
    }
    
}
