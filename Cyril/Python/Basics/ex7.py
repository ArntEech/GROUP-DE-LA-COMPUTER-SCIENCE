maxAge = 90
daysPerYear = 365
weeksPerYear = 52
monthsPerYear = 12

currentAge = int(input("What is your current age? "))

yearsLeft = maxAge - currentAge
daysLeft = yearsLeft * daysPerYear
weeksLeft = yearsLeft * weeksPerYear
monthsLeft = yearsLeft * monthsPerYear

print(f"""You have {daysLeft} days, {weeksLeft} weeks, and {monthsLeft} months left.""")