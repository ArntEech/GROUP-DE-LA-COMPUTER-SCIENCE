## Exercise 19 - FizzBuzz

'''
Instructions:

+ Write a program that automatically prints the solution to the FizzBuzz game

+ Your program should print each number from 1 to 100 in turn.

+ When the number is divisible by 3 then instead of printing the number, it should print "Fizz"

+ When the number is divisible by 5 then instead of printing the number, it should print "Buzz"

+ And if the number is divisible by both 3 and 5 e.g. 15 then instead of the number it should print "FizzBuzz"

Example Output:
1

2

Fizz

4

Buzz

Fizz

7 

8

Fizz

Buzz

11

Fizz

13

14

FizzBuzz



'''

for num in range(1, 101):
    # checks for numbers only divisible by  3
    if num % 3 == 0 and num % 5 != 0:
        print("Fizz")
    # checks for numbers only divisible by 5
    elif num % 5 == 0 and num % 3 != 0:
        print("Buzz")     
    # checks for numbers divisible by both 3 and 5
    elif num % 3 == 0 and num % 5 == 0:
        print("FizzBuzz")
    else:
        print(num)