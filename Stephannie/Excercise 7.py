#LifeInWeeks
max_age = 90

current_age  = int(input("Enter your current age: "))

num_of_years_left = max_age - current_age

weeks_left = num_of_years_left * 52
months_left = num_of_years_left * 12
days_left = num_of_years_left * 356

print(f"You have {days_left} days, {weeks_left} weeks, {months_left} months left to " + 
      "live until 90 years. ")