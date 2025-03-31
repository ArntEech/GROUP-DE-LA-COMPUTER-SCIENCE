#Project 5 - Password Generator 

import random
letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
numbers = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
symbols = ['!', '#', '$', '%', '&', '(', ')', '*', '+']

print("Welcome to the Arnatech's Password Generator!")
nr_letters= int(input("How many letters would you like in your password?\n")) 
nr_symbols = int(input(f"How many symbols would you like?\n"))
nr_numbers = int(input(f"How many numbers would you like?\n"))


#Selecting random letters based on the input
user_letset = []
for l in range(0, nr_letters):
    user_letset.append(random.choice(letters))


#Selecting random symbols based on the input
user_symset = []
for s in range(0, nr_symbols):
    user_symset.append(random.choice(symbols))


#Selecting random numbers based on the input
user_numset = []
for n in range(0, nr_numbers):
    user_numset.append(random.choice(numbers))


#Creating the password based on the inputs
password_set = user_letset + user_numset + user_symset

r_password_set = random.sample(password_set, len(password_set))

password = ""

for p in r_password_set:
    password = password + p

    
print(f"Here is your password: {password}")