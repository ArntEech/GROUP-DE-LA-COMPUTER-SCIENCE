'''
Instructions:
+Create a class name 'QuizBrain'
+Define two attributes namely: 'question_number = 0' and 'questions_list' 
+Create a method named 'next_question()'
+The method should:
    -Retrieve the item at the current question_number from the question_list.
    -Use the input() function to show the user the Question text and ask for the user's answer.
'''
class QuizBrain:
    def __init__(self, q_list):
        self.question_list = q_list
        self.question_number = 0 #To keep track of the question number
        self.score = 0 #To keep track of the question sscore
        
    def still_has_questions(self): #Return True or False based on the given condition
        return self.question_number < len(self.question_list)
    
    def next_question(self):
        current_question = self.question_list[self.question_number] #Retrieves a Question object from the question_bank list
        correct_ans = current_question.answer
        q_num = self.question_number + 1
        self.question_number += 1
        choice = input(f"Q.{q_num}: {current_question.text} (True/False)") 
        self.check_answer(choice, correct_ans)
    
    def check_answer(self, u_choice, c_ans):
        message = [f'''
        You got it right!
        The correct answer was: {c_ans}
            ''',
                
        f'''
        Sorry you got it wrong!
        The correct answer was: {c_ans}
        ''']
        
        if u_choice == c_ans:
            self.score += 1
            print(message[0])
        else:
            print(message[1])
        print(f'''Your current score is: {self.score}/{self.question_number}
              
              ''')  
           
             
       