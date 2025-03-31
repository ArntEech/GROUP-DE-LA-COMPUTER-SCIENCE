# Exercise 5 - Data Types, type convertion and type checking 
'''
Instructions:
Write a program that adds the digits in a 2 digits number. 
e.g if the input was 35, then the output should be 3+5 = 8

'''
# Don't change the code below
two_digit_number = input("Type a two digit number: ")
# Don't change the code above

#####################################################
#Write your code below this line 
num_str = two_digit_number
a = int(num_str[0]) #converts the first character to integer
b = int(num_str[1]) #converts the second character to inte
print(a + b)

