const readlineSync = require('readline-sync');

class quizBrain {
    constructor(questions){
        this.questionNumber = 0;
        this.score = 0;
        this.questionList = questions;
    }
    stillHasQuestions(){
        return this.questionNumber < this.questionList.length;
    }
    nextQuestion() {
        const currentQuestion = this.questionList[this.questionNumber];
        this.questionNumber++;
        const userAnswer = readlineSync.question(
            `Q.${this.questionNumber}: ${currentQuestion.text} (True/False): `
        );
        this.checkAnswer(userAnswer, currentQuestion.answer);
    }
}