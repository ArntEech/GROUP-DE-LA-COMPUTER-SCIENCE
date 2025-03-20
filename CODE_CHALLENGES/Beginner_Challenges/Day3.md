# 🌟 DAY THREE - Conditional Statements, Logical Operators, Code Blocks and Scope 🌟

⚠️ Notice: For all exercises, use only basic programming skills—avoid loops, functions, or advanced techniques.


## 🏋️ Exercise 9 - BMI Calculator 2.0 

📌 **Instructions:**

Write a program that interprets the Body Mass Index (BMI) on a user's weight and height.
It should tell them the interpretation of thier BMI value.

🔹 BMI Categories:

Below 18.5 → Underweight

18.5 to 24.9 → Normal weight

25 to 29.9 → Overweight

30 to 34.9 → Obese

35 and above → Clinically Obese

Example:

🔹Input:

Enter your weight ? 80

Enter your height ? 1.75

🔹Output:

Your BMI is 28, you are overweight

📝 Hint: Use conditional statements to determine the BMI category.



## 📅 Exercise 10 - Leap Year

📌 **Instructions:**

Write a program that works out whether if a given year is a leap year.

A normal year has 365 days, leap years have 366, with and extra day in February.

This is how to work out whether if a particular year is a leap year.

🔹On every year that is evenly divisible by 4 

🔹except every year that is evenly divisible by 100

🔹unless the year is also evenly divsible by 400
    
e.g: The year 2000

2000 divided by 4 = 500 (Leap)

2000 divided by 100 = 20 (Not Leap)

2000 divided by 400 = 5 (Leap!)

So the year 2000 is a leap year


But the year 2100 is not a leap year because:

2100 divided by 4 = 525 (Leap)

2100 divided by 100 = 21 (Not Leap)

2100 divided by 400 = 5.25 (Not Leap)

Example: 

🔹input:

2400                      
                         
🔹output: 
                 
Leap year              

📝 Hint: Use conditional statements to check each rule in order.



## 🍕 Exercise 11 - Pizza Order

📌 **Instructions:**

Congratulations, you've got a job at a Pizza Joint. 

Your first job is to build an automatic pizza order program.

Based on a user's order, work out thier final bill.

Create a special greeting for your program

Example:

Welcome to Papa's Pizza

🔹input: 

What size pizza do you want? S, M, or L: L

Do you want pepperoni? Y or N: Y

Do you want extra cheese? Y of N: N

🔹output:

Your final bill is: $28

NB: 
+ Small Pizza: $15               

+ Medium Pizza: $20              

+ Large Pizza: $25
  
+ Pepperoni for Medium or Large Pizza: + $3
  
+ Pepperoni for Small Pizza: + $2
  
+ Extra cheese for any size pizza: + $1

📝 Hint: Use nested conditionals to calculate the final cost.



##❤️ Execise 12 - Love Calculator Exercise

📌 **Instructions:**

You are going to write a program that tests the compatibilty between two people. We're going to use the super scientific method below:

*Method:*

🔹 Steps:

1️⃣ Take two names as input.

2️⃣ Count the occurrences of the letters in TRUE across both names.

3️⃣ Count the occurrences of the letters in LOVE across both names.

4️⃣ Combine the two numbers to form a percentage score.


*ILLUSTRATION:*

e.g: 

Arianna Rebolini and Channing Tatum

Procedure:
T (2 occurances of 'T' in the names listed)    L (1 occurances of 'L' in the names listed)

R (2 occurances of 'R' in the names listed)    O (1 occurances of 'O' in the names listed)

U (1 occurances of 'U' in the names listed)    V (0 occurances of 'V' in the names listed)

E (1 occurances of 'E' in the names listed)    E (1 occurances of 'E' in the names listed)

__________________________________________________________________________________________

   6                                              3     
___________________________________________________________________________________________

*Conclusions:*

🔹 Score Interpretation:

Less than 10 or greater than 90 → "You go together like coke and mentos!"

Between 40 and 50 → "You are alright together."

Otherwise → Simply print the love score.


In the above illustration, the message will be:

---Your score is 63---

Example:

🔹Input: 
                   
What is your name?        

  Natsu Dragneel          

                          
What is their name?       

  Lucy Heartfila          

🔹Output:

Your score is 96, you go together like coke and mentos.

📝 Hints:

🔹 The .lower() function converts text to lowercase. (Use your programming language equivalent)

🔹 The .count() function counts occurrences of a letter in a string.(Use your programming language equivalent)

