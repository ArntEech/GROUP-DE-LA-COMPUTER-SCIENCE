class quizBrain {
    constructor(questions){
        this.questionNumber = 0;
        this.score = 0;
        this.questionList = questions;
    }
    stillHasQuestions(){
        return this.questionNumber < this.questionList;
    }
}