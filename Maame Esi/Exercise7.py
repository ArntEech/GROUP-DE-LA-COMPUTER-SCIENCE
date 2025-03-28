#Create a program that calculates the time left if you were to live until 90 years old.

currentAge = input('What is your current age? ')

ageLeft = 90 - int(currentAge)
daysLeft = ageLeft * 357

print(daysLeft)