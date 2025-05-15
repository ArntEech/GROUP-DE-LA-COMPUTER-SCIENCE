from question_model import Question
from data import question_data
from quiz_brain import QuizBrain

#Creating a question bank
question_bank = []
size = len(question_data)

#Filling the question_bank list with Question objects
for i in range(0, size):
    ques = question_data[i]["text"]
    ans = question_data[i]["answer"]
    prompt = Question(ques, ans)
    question_bank.append(prompt)

test = QuizBrain(question_bank)

while test.still_has_questions():
    test.next_question()

print(f''' 
You've completed the quiz
Your final score was: {test.score}/{test.question_number}
      ''')