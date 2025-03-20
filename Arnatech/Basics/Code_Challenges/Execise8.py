# Exercise 9 - BMI Calculator 2.0 
'''
Instructions:

Write a program that interprets the Body Mass Index (BMI) on a user's weight and height.
It should tell them the interpretation of thier BMI value.

+ Under 18.5 they are underweight.
+ Over 18.5 but below 25 they have a normal weight.
+ Over 25 but below 30 they are overweight.
+ Over 30 but below 35 they are obese.
+ Above 35 they are clinically obese.

Example Input and Output:

Input:
Enter your weight ? 80
Enter your height ? 1.75

Output:
Your BMI is 28, you are overweight


'''

# Don't change the code below
height = float (input("Enter your height in m: "))
weight = float (input("Enter your weight in kg: "))
# Don't change the code above

#Write your code below this line
BMI = round(weight/(height**2))
if BMI < 18.5:
    print(f"Your BMI is {BMI}, you are underweight")
    
elif BMI > 18.5 and BMI < 25:
    print(f"Your BMI is {BMI}, you have a normal weight")
    
elif BMI > 25 and BMI < 30:
    print(f"Your BMI is {BMI}, you are overweight")

elif BMI > 30 and BMI < 35:
    print(f"Your BMI is {BMI}, you are obese")
    
else:
    print(f"Your BMI is {BMI}, you are clinically obese")