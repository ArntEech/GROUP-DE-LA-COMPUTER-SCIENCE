#Password Generator

import random
letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
           'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']

numbers = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']

symbols = ['!', '#', '$', '%', '&', '(', ')', '*', '+']

def Welcome_Msg():
    print("I am about to generate a strong password for you. I only need a few specifications from you.")

Num_of_letters = int(input("How many letters do you want to include in your password?\n"))

Num_of_Symbols = int(input("How much symbols do you want to include in your password?\n"))

Num_of_values = int(input("How many digits do you want to include in your password?\n"))

chosen_letters = random.sample(letters, Num_of_letters)
chosen_symbols = random.sample(symbols, Num_of_Symbols)
chosen_values = random.sample(numbers, Num_of_values)

chosen_total = chosen_letters + chosen_symbols + chosen_values
random.shuffle(chosen_total)

password = "".join(chosen_total)
print(f"Your password is: {password}")