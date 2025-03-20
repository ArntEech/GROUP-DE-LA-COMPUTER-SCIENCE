##Exercise 7

current_age = int(input("Enter your current age:"))
time_left = 90 - current_age

days_left = time_left * 365
weeks_left = time_left * 52
months_left = time_left * 12

print("You have {} days, {} weeks, and {} months left.".format(days_left, weeks_left, months_left))