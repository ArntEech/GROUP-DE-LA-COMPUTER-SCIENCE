# Exercise 14 - Banker Roulette

import random
#Split string method 
names_string = input("Give me everybody's names, seperated by a comma. ")

#Defines the seperate component which in this case is ", " and stores the individual members in a list(names in this case).
names = names_string.split(", ")


# Finds the number of members in the names list
a = len(names)

#selects a random number within the range (x, y); x and y are inclusive
i = random.randint(0, a)

print(f"{names[i]} is going to buy the meal today")