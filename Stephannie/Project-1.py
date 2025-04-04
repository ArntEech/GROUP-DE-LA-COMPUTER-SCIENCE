#Mini projects Number 1
#Band Name generator
import time

#Welcome message
def greet():
  print("Finding it hard to think of a band name...?\n")
  print("Welcome to the BAND_NAME generator.Let's get you one quickly in a few steps.\n")
greet()

#Taking user input to generate a bandname
city = input("Which city did you grow up in?\n").lower()
pet = input("Enter the name of your pet if you have one\n").lower()
if pet == "":
    any_pet = input("What name would you have given a pet if you had one.").lower()
    pet = any_pet
else:
    print("All set, are you ready!")

#Generatinnggggg
print("Let the countdown begin...")
band_name = city.capitalize() + " " + (pet).capitalize()
for num in range(3, 0, -1):
    print(num)
    time.sleep(1)

#Output Message
print(f"Your BAND_NAME is {band_name}: How does is sound?")
print("Yes, Amazing")


