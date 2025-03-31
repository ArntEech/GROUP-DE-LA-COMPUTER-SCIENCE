## Exercise 19 - FizzBuzz

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