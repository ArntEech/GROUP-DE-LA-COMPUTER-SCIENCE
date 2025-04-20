print("Welcome to the Tip Calculator!:\n")

bill_amt = float((input("What's the total bill amount?:")))

percentage = float(input("What percentage of the tip would you like to give?:"))
bill_split =int(input("How many people are splitting the bill?:\n"))

bill_with_percent = bill_amt * (percentage * 0.01)
bill_amt += bill_with_percent
final_amt = round((bill_amt)/ bill_split, 2)

print("Each person should pay:{}".format("$" + str(final_amt)))
