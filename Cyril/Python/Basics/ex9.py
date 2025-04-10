height:float = float(input("Enter your height in m: "))

weight:float = float(input("Enter your weight in kg: "))

bmi = (weight / (height * height))

if (bmi < 18.5):
    category = 'Underweight'
elif (bmi >= 18.5 and bmi <= 24.9):
    category = 'Normal weight'
elif (bmi >= 25 and bmi <= 29.9):
    category = 'Overweight'
elif (bmi >= 30 and bmi <= 34.9):
    category = 'Obese'
else:
    category = 'Clinically Obese'


print(f'''Your BMI is {round(bmi)}, you are {category}.''');