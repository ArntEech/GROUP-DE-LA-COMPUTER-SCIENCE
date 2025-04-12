height:float = float(input("Enter your height in m: "))

weight:float = float(input("Enter your weight in kg: "))

bmi = (weight / (height * height))
bmi = round(bmi)
print("Your Body Mass Index is:",bmi)