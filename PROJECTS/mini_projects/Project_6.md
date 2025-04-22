# 🔢 Mini Project - Command Line Calculator

## 🧠 Concept:
Your task is to **build a simple command-line calculator** that can perform **basic arithmetic operations**. This calculator should keep running until the user decides to start a new calculation. You’ll be implementing everything you’ve learned so far – **functions, inputs, outputs, loops, conditionals, and dictionaries/maps**.

---

## 💻 Expected Features:

✅ Takes **two numbers** as input from the user  
✅ Accepts an **operation symbol** (`+`, `-`, `*`, `/`)  
✅ Performs the correct calculation using **functions/Methods**  
✅ Uses a **dictionary/map** (or similar structure) to choose the operation  
✅ Shows the result in the format:  
```python
7 * 4 = 28
```
✅ Allows the user to **continue calculating** with the result or start over  

---

## 🔠 Starting ASCII Art Logo:

```python
logo = """
 _____________________
|  _________________  |
| | Codinista   0. | |  .----------------.  .----------------.  .----------------.  .----------------. 
| |_________________| | | .--------------. || .--------------. || .--------------. || .--------------. |
|  ___ ___ ___   ___  | | |     ______   | || |      __      | || |   _____      | || |     ______   | |
| | 7 | 8 | 9 | | + | | | |   .' ___  |  | || |     /  \     | || |  |_   _|     | || |   .' ___  |  | |
| |___|___|___| |___| | | |  / .'   \_|  | || |    / /\ \    | || |    | |       | || |  / .'   \_|  | |
| | 4 | 5 | 6 | | - | | | |  | |         | || |   / ____ \   | || |    | |   _   | || |  | |         | |
| |___|___|___| |___| | | |  \ `.___.'\  | || | _/ /    \ \_ | || |   _| |__/ |  | || |  \ `.___.'\  | |
| | 1 | 2 | 3 | | x | | | |   `._____.'  | || ||____|  |____|| || |  |________|  | || |   `._____.'  | |
| |___|___|___| |___| | | |              | || |              | || |              | || |              | |
| | . | 0 | = | | / | | | '--------------' || '--------------' || '--------------' || '--------------' |
| |___|___|___| |___| |  '----------------'  '----------------'  '----------------'  '----------------' 
|_____________________|
"""
```
## Instructions:

### 🔹 Step 1: Define Basic Functions

Create separate functions/methods to perform the four arithmetic operations:
 + Addition
 + Subtraction
 + Multiplication
 + Division

Each function should take **two numbers** and return the result.

### 🔹 Step 2: Create an Operations Map

Create a **dictionary or map** to connect symbols like `+`, `-`, `*`, `/` to the corresponding functions.

> 💡 **Hint:** Use the operation symbols as **keys** and the function names as **values**.

### 🔹 Step 3: Input the First Number

Prompt the user to enter the first number.

### 🔹 Step 4: Show Available Operations
Display all the operation symbols (`+`, `-`, `*`, `/`) to the user.

### 🔹 Step 5: Loop Through Calculations
+ Ask the user to **pick an operation**
+ Get the next number.
+ Perform the calculation and **display the result**
+ Ask if they want to:
  - 🔁 Continue calculating with the current result, or

  - 🔄 Start a new calculation (clear/reset)
    
Use a loop to keep the calculator running based on the user's choie.

### 🧪 Sample Input/Output
```perl
 _____________________
|  _________________  |
| | Codinista   0. | |  .----------------.  .----------------.  .----------------.  .----------------. 
| |_________________| | | .--------------. || .--------------. || .--------------. || .--------------. |
|  ___ ___ ___   ___  | | |     ______   | || |      __      | || |   _____      | || |     ______   | |
| | 7 | 8 | 9 | | + | | | |   .' ___  |  | || |     /  \     | || |  |_   _|     | || |   .' ___  |  | |
| |___|___|___| |___| | | |  / .'   \_|  | || |    / /\ \    | || |    | |       | || |  / .'   \_|  | |
| | 4 | 5 | 6 | | - | | | |  | |         | || |   / ____ \   | || |    | |   _   | || |  | |         | |
| |___|___|___| |___| | | |  \ `.___.'\  | || | _/ /    \ \_ | || |   _| |__/ |  | || |  \ `.___.'\  | |
| | 1 | 2 | 3 | | x | | | |   `._____.'  | || ||____|  |____|| || |  |________|  | || |   `._____.'  | |
| |___|___|___| |___| | | |              | || |              | || |              | || |              | |
| | . | 0 | = | | / | | | '--------------' || '--------------' || '--------------' || '--------------' |
| |___|___|___| |___| |  '----------------'  '----------------'  '----------------'  '----------------' 
|_____________________|

Enter the first number: 7  
+  
-  
*  
/  
Pick an operation: *  
What's the next number?: 4  
7 * 4 = 28  
Type 'y' to continue calculating with 28, or 'n' to start a new calculation: y  
Pick an operation: +  
What's the next number?: 2  
28 + 2 = 30  
Type 'y' to continue calculating with 30, or 'n' to start a new calculation: n  
```
### 🌐 Language Notes
💡 You can write this calculator in any programming language of your choice:
+ Python
+ Java
+ JavaScript
+ Dart

✅ Just make sure the behavior/output remains the same.

### Bonus Challenge (Optional):
+ Add error handling for division by zero.
+ Add a power/exponentiation operator(`^`)
+ Allow users to chain multiple operation like:
 - `2 + 3 * 5` (without restarting).

### 🚀 Go Build It!

Use everything you've learned so far to complete this awesome mini-projects!

🧠 Have fun building and testing it out!

  


