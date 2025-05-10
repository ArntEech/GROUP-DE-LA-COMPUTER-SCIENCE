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
    
    checkAnswer(userAnswer, correctAnswer) {
        if (userAnswer.toLowerCase() === correctAnswer.toLowerCase()) {
            this.score++;
            console.log("You got it right!");
        } else {
            console.log("That's wrong.");
        }
        console.log(`The correct answer was: ${correctAnswer}.`);
        console.log(`Your current score: ${this.score}/${this.questionNumber}\n`);
    }
}