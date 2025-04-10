#payment of food or an order by randomisation
import random

print("Worry no more about deciding who will pay:), I've got you!")
print("Let's get started!")
names = input("Enter the name of those eligible to pay. Separate by a space. \n").split()

name_topay = random.choice(names)

print(f"That was easy, {name_topay} is going to pay for the food!")