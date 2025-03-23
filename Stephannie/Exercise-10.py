normal_year = 365
leap_year = 366

year = int(input("Enter the year you want to check: "))

condition_1 = year/4
condition_2 = year/100
condition_3 = year / 400

if condition_1 % 2 == 0 and condition_2 % 2 != 0:
    print("The year is a leap year")

elif condition_1 % 2 == 0 and condition_3 % 2 ==0:
    print("The year is a leap year")

elif condition_2 % 2 != 0: 
    print("The year is not a leap year.")

elif condition_3 % 2 != 0:
    print("The year is not a leap year.")

else:
    print("The year you entered is not tracked")

    

