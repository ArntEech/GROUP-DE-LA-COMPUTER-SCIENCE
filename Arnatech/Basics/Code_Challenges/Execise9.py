# Exercise 10 - Leap Year


# Accepting the year input
year = int(input("Which year do you want to check? "))


# Defining the conditions for a leap year
if year % 4 == 0:
    if year % 100 != 0:
        print("Leap year.")
        
    elif year % 400 == 0:
        print("Leap year.")
    else:
        print("Not a leap year")
else:
    print("Not a leap year")

