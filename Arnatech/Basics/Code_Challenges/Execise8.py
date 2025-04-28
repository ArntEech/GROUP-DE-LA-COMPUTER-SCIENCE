# Exercise 8 - BMI Calculator 2.0 


# Accepting in height and weight inputs
height = float (input("Enter your height in m: "))
weight = float (input("Enter your weight in kg: "))


# Calculates the BMI based on the weight and height values
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