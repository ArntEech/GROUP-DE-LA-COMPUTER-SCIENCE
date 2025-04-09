import random

input_names = input("Enter a list of names separated by commas (e.g.Cyril, Joe, Sonny): ").strip()

names = [name.strip() for name in input_names.split(',')]

random_index = random.randint(0, len(names) - 1)

selected_name = names[random_index]

print(f"{selected_name} is going to buy the meal today!")