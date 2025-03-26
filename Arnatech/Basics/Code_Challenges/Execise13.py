# Exercise 13 - Heads or Tails
'''
Instructions:

+ You are going to write a virtual coin toss program.
+ It will randomly tell the user "Heads" or "Tails".
+ The first letter should be capitalised and spelt exactly like in the example e.g Heads, not heads
+ You should generate a random number, either 0 or 1
+ Then use that number to print out Heads or Tails

'''
#Write your code below this line
import random

random_num = random.randint(0,1)

if random_num == 1:
    print("Heads")
else:
    print("Tails")



