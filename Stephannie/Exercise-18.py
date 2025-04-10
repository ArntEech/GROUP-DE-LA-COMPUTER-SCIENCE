#sum of all even numbers
import random

numbers = range(0, 101, 2)
even_num = list(numbers)
total = 0        #a starting point for the sum

for i in even_num:
    total += i
print(total)
