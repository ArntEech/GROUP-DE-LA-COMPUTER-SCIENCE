# Execise 7 - Life in Weeks 

#Instructions
'''
1. Create a program using the maths and f-strings that tells us how many days, weeks, months we have left if we live until 90 years old.
2. It will take your current age as the input and output a message with your time left in this format:

--You have x days, y weeks, and z months left.
Where x, y, and z are replaced with the actual numbers

Warning: Your output should match the Example Output format exactly, even the positions of the commas and full stops.

# Example Input and Output
input: 56

output: You have 12410 days, 1768 weeks, and 408 months left.

'''
# Don't change the code below 
age = input("What is your current age? ")
# Don't change the code above

#Write your code below this line
yrs_left = 90 - int(age)
days_left = yrs_left * 365 # There are 365 days in a year
weeks_left = yrs_left * 52 # There are 52 weeks in a year
months_left = yrs_left * 12 # There are 12 months in a year

print(f"You have {days_left} days, {weeks_left} weeks, and {months_left} months left.")
