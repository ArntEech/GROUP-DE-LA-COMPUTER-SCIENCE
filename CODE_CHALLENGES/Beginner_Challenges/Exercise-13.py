#coin toss program
import random
print("Hey there, I am about to make tossing easier for you.")

print("I will toss a coin for you and tell you the result.")
print("Now, lets see what you got!\n")
num = random.choice([0,1])

if num == 0:
    print("Tails")
else:
    print("Heads")