#BMI interpretation

weight = float(input("Enter your current weight in kg: "))

height = float(input("Enter your curent height in m: "))

BMI_original = weight / height ** 2
BMI = round(BMI_original, 3)

if BMI <= 18.5:
   print(f"Your BMI is {BMI}, you are underweight.")
elif BMI >= 18.5 and BMI <= 24.9:
   print (f"Your BMI is {BMI}, you have a normal weight.")
elif BMI >= 25 and BMI <= 29.9:
   print(f"Your BMI is {BMI}, you are overweight.")
elif BMI >= 30 and BMI <= 34.9:
   print(f"Your BMI is {BMI}, you are Obese.")
elif BMI >= 35:
   print(f"Your BMI is {BMI}, you are clinically Obese.")
else:
   print("Invalid input for weight and height.Try again.")   
   

#Done
