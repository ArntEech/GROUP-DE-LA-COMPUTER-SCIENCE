##Exercise 7

weight = float(input("Enter your weight in kg:"))
height = float(input("Enter your height in m:"))

BMI = int(weight / height)


if BMI < 18.5:
    print("Your BMI is {}, you are underweight".format(str(BMI)))

elif 18.5 <= BMI <= 24.9:
    print("Your BMI is {}, you are normal weight".format(str(BMI)))

elif 25 <= BMI <= 29.9:
    print("Your BMI is {}, you are overweight".format(str(BMI)))

elif 30 <= BMI <= 34.9:
    print("Your BMI is {}, you are obese".format(str(BMI)))

elif BMI >= 35:
    print("Your BMI is {}, you are clinically obese".format(str(BMI)))


