import random

print("--Welcome to the Password Generator--")

letters_count = int(input("How many letters would you like in your password? "))
symbols_count = int(input("How many symbols would you like? "))
numbers_count = int(input("How many numbers would you like? "))

letters = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'
symbols = '!#$%&()*+'
numbers = '0123456789'


password = [random.choice(letters) for char in range(letters_count)]

password += [random.choice(symbols) for char in range(symbols_count)]

password += [random.choice(numbers) for char in range(numbers_count)]

random.shuffle(password)

final_password = ''.join(password)

print(f"Your generated password is: {final_password}")
