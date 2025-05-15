#tip calculator

#A welcome greeting

def greet():
    print("Welcome to the Good day Tip Calculator.")
greet()

#Taking user information on current bill. tip percentage and number of people sharing the bill

current_bill = float(input("What is the total bill?\n"))
tip_percent = float(input("What percentage of the bill would you want to tip?\n"))
if tip_percent == "":
    print("Tip wouldn't be included then.")  
else:
    tip_percent

num_of_people = int(input("How many people are sharing this bill.\n"))

#computations to get the individual bill to be paid

tip_amount = (tip_percent/100) * current_bill
total_bill = current_bill + tip_amount
single_bill = (total_bill/ num_of_people)

R_single_bill = round(single_bill, 2)
R_total_bill = round(total_bill, 4)

#Output Message
print(f"Your total amount is {R_total_bill}, therefore each person pays {R_single_bill}")