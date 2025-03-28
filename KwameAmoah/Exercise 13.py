import random
names = input("Enter the list of names:").split()
print(names)

print("{} is going to buy the meal today!".format(names[random.randint(0, (len(names)-1))]))


