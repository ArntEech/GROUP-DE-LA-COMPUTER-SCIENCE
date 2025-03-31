size = input("What size pizza do you want? S, M or L:" )
pep_choice = input("Do you want pepperoni?:")
cheese_choice = input("Do you want extra cheese?:")

bill = 0

if size ==  "S":
    if pep_choice == "Y":
        bill += 15 + 3
elif size == "M":
    if pep_choice == "Y":
        bill += 20 + 2
elif size == "L":
    if pep_choice == "Y":
        bill += 25 + 3

if (size == "S" or size == "M" or size == "L") and cheese_choice == "Y":
    bill += 1

print("Your final bill is ${}".format(bill))

