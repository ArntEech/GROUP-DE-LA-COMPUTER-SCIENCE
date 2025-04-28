import random
letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']

numbers = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']

symbols = ['!', '#', '$', '%', '&', '(', ')', '*', '+']


print("Welcome to the random password generator!\n")


password = ""
letter_num = int(input("How many letters would you like in your password\n"))

symbol_num = int(input("How many symbols would you like?:\n"))

number_num = int(input("How many numbers would you like?:"))

i = 0
while i < letter_num:
    password += random.choice(letters)
    i +=1

i = 0
while i < symbol_num:
    password += random.choice(symbols)
    i +=1

i = 0
while i < number_num:
    password += random.choice(numbers)
    i +=1

print("Here is your password: {}".format(password))




