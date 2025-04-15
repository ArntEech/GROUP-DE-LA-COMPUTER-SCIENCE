import math

print("Welcome to the Tip Calculator!")

totalBill = float(input("What was the total bill: $"))

tipPercentage = int(input("What percentage tip would you like to give? 10, 12, or 15: "))

people = int(input("How many people to split the bill? "))

tip = totalBill * (tipPercentage / 100)
total = totalBill + tip
eachPerson = total / people

print(f"Each person should pay: ${round(eachPerson,2)}")