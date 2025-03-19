# BMI Calculatoer Exercise

#Instructions
'''
Write a program that calculates the Body Mass index(BMI) from a user's weight and height.

The BMI is a measure of some's weight taking into account their height. 
e.g. if a tall person and a short person both weight the same amount, the short person is usally more overweight.
The BMI is calculated by dividing a person's weight (in Kg) by the square of thier height(in meters):

BMI = weight(kg) divided by the height(m) squared
NB: Make sure your results is printed as a whole number.
'''

# Don't change the code below
height = input("enter your height in m: ")
weight = input("enter your weight in kg: ")
# Don't change the code above

# Write your code below this line
h = float(height)
w = float(weight)

BMI = (w/h**2)
print("Your Body Mass Index is: ", int(BMI))