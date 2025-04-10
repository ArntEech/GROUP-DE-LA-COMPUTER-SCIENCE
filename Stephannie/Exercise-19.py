#FizzBuzz game
import random
number = random.randint(1, 100)

if (number % 5 == 0  and number % 3 == 0):
    print("Fizz Buzz")
elif (number % 5 == 0):
    print("Buzz.")
elif (number % 3 == 0):
    print("Fizz.")
else:
    print(number)

