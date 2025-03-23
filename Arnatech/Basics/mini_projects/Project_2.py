#Project 2 - Tip Calculator

#Instructions
'''
1. Create a suitable greeting for program

2. The program should accept a total bill (e.g + 124.56)

3. The program should allow the user to choose the percentage of tip to give

4. The program should accept the number of people to split the bill.

5. Finally, your program should output the amount each person should pay rounded to two decimal places.

#Example Input and Output

input: --
What was the total bill? 124.56
What percentage tip would you like to give? 10, 12, or 15? 12
How many people to split the bill? 7

output: Each person should pay: $19.93

NB: The prompts should be exactly or similar to the example given.
Guide: if the bill was $124.56, the tip percentage is 12, and the number of people is 7,
logic:
. Calculate 12 percent on 124.56
. Add the results to 124.56
. Divide the new result by the number on people(.i.e 7 in this case)
. The output value will be $19.93

'''

print("Welcome to the Arnatech Tip Calculator\n======================================")
total_bill = float(input("What was the total bill? $"))
percent_value = int(input("What percentage tip would you like to give? 10, 12, or 15? "))
people_nums = int(input("How many people are to split the bill? "))

p = percent_value/100
tip = p * total_bill
new_amount = total_bill + tip
each_pay = new_amount/people_nums 
#Using the format function
final_amount = "{:.2f}".format(round(each_pay, 2))
message = f"Each person should pay: ${final_amount}"

print(message)