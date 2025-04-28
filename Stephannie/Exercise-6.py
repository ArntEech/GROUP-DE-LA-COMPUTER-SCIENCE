#BMI calculator
print("Get ready to calculate your body mass index.")
weight = int(input("Enter your current weight in kg\n"))

height = int(input("Enter your current height in m\n"))

BMI = weight / (height ** 2)

print(f"Your body mass Index is: {BMI}")