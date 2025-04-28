# 🧠 Day 11 - True/False Quiz Game (OOP & Modular Programming)

## 🎯 Objective:
Build a console-based **True or False Quiz Game** using **Object-Oriented Programming (OOP)** and **modular code structure**. The app will display a series of questions, accept user answers, track scores, and give feedback.

---

## 📁 Folder Structure

+ You must create a folder called: Execise31

+ Inside that folder, create the ff 4 seperate files.:
     - Main file: Main entry point to start the quiz
     - QuizBrain file: Manages quiz flow and logic
     - Question file: Holds the structure of a Question
     - Data file: Stores quiz question data


---

## 🧩 Module Responsibilities

---

### ✅ 1. `question_model` (Question Structure)

This module defines the blueprint or structure for a **quiz question**.

#### 🔧 What to include:
- A **class or object template** called `Question`
- It should have two properties:
  - `text` → the question text
  - `answer` → the correct answer
- A **constructor** that accepts two parameters:
  - The question text
  - The correct answer
- These should be stored in the object's internal properties

---

### ✅ 2. `data` (Question List)

This module holds a collection of **predefined quiz questions**.

#### 🔧 Use this default set of questions: (Change the syntax to meet your programming language equivalent
```python
question_data = [
    {"text": "A slug's blood is green.", "answer": "True"},
    {"text": "The loudest animal is the African Elephant.", "answer": "False"},
    {"text": "Approximately one quarter of human bones are in the feet.", "answer": "True"},
    {"text": "The total surface area of a human lungs is the size of a football pitch.", "answer": "True"},
    {"text": "In West Virginia, USA, if you accidentally hit an animal with your car, you are free to take it home to eat.", "answer": "True"},
    {"text": "In London, UK, if you happen to die in the House of Parliament, you are entitled to a state funeral.", "answer": "False"},
    {"text": "It is illegal to pee in the Ocean in Portugal.", "answer": "True"},
    {"text": "You can lead a cow down stairs but not up stairs.", "answer": "False"},
    {"text": "Google was originally called 'Backrub'.", "answer": "True"},
    {"text": "Buzz Aldrin's mother's maiden name was 'Moon'.", "answer": "True"},
    {"text": "No piece of square dry paper can be folded in half more than 7 times.", "answer": "False"},
    {"text": "A few ounces of chocolate can to kill a small dog.", "answer": "True"}
]
```

### ✅ 3. `quiz_brain` (Quiz Logic Handler)

This module will manage the core quiz functionality, including:

+ Tracking the number of questions answered

+ Asking each question

+ Checking if the user is correct

+ Keeping score

#### 🔧 Include the following:
- A **class** or **function** module named `QuizBrain` or similar
- It internally track:
  - `current_question_index` 
  - `score`
  - `question_list` (filled with the question objects)
    
#### 🔄 Required Methods/Functions:
1. `still_has_questions()`
   - Returns `True` if there are more questions to ask and `False` otherwise
2. `next_question()`
   - Retrieves the next question and prompts the user
3. `check_answer(user_input, correct_answer)`
   - Compares the user’s input to the correct answer
   - Updates the score if correct
   - Provides feedback

### ✅ 4. main (Quiz Entry Point)
This is where your application starts. It will:
+ Import/require the other modules
+ Transform each dictionary in the `question_data` list into a `Question` object
+ Store all `Question` objects in a list or array
+ Create an instance of your `quiz_brain` class
+ Loop through questions using the methods you've defined
+ Print the final score at the end

### 🧪 Sample Output
```txt
Q.1: A slug's blood is green. (True/False)True

        You got it right!
        The correct answer was: True

Your current score is: 1/1


Q.2: The loudest animal is the African Elephant. (True/False)False

        You got it right!
        The correct answer was: False

Your current score is: 2/2


Q.3: Approximately one quarter of human bones are in the feet. (True/False)False

        Sorry you got it wrong!
        The correct answer was: True

Your current score is: 2/3


Q.4: The total surface area of a human lungs is the size of a football pitch. (True/False)True

        You got it right!
        The correct answer was: True

Your current score is: 3/4


Q.5: In West Virginia, USA, if you accidentally hit an animal with your car, you are free to take it home to eat. (True/False)False

        Sorry you got it wrong!
        The correct answer was: True

Your current score is: 3/5


Q.6: In London, UK, if you happen to die in the House of Parliament, you are entitled to a state funeral. (True/False)False

        You got it right!
        The correct answer was: False

Your current score is: 4/6


Q.7: It is illegal to pee in the Ocean in Portugal. (True/False)False

        Sorry you got it wrong!
        The correct answer was: True

Your current score is: 4/7


Q.8: You can lead a cow down stairs but not up stairs. (True/False)False

        You got it right!
        The correct answer was: False

Your current score is: 5/8


Q.9: Google was originally called 'Backrub'. (True/False)False

        Sorry you got it wrong!
        The correct answer was: True

Your current score is: 5/9


Q.10: Buzz Aldrin's mother's maiden name was 'Moon'. (True/False)True

        You got it right!
        The correct answer was: True

Your current score is: 6/10


Q.11: No piece of square dry paper can be folded in half more than 7 times. (True/False)True

        Sorry you got it wrong!
        The correct answer was: False

Your current score is: 6/11


Q.12: A few ounces of chocolate can to kill a small dog. (True/False)False

        Sorry you got it wrong!
        The correct answer was: True

Your current score is: 6/12



You've completed the quiz
Your final score was: 6/12
```
### 🌐 Language-Agnostic Notes
This project can be implemented in any **object-oriented** or **structured programming language**, such as:
+ Python
+ Java
+ JavaScript
+ C++
+ C#
+ Dart
+ Ruby

The key concepts to apply:
+ Use classes or objects to encapsulate logic and data
+ Use methods/functions for behavior
+ Use arrays/lists/collections for storing the questions

### 💥 Bonus Ideas (Optional):

+ Filter questions by difficulty (easy, medium, hard)
+ Add a timer for each question
+ Save high scores to a file or database
+ Pull live quiz questions from an API
    
🎯 Goal: Apply OOP principles, modular programming, and clean user interaction

Happy coding! 💻💡
    
    

