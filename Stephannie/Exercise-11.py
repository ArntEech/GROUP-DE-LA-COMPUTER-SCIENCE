print("WELCOME to Pizza Avenue.")

print("We have; \n, 1. Small(S), 2.Medium(M), 3.Large(L)")
pizza_size_choice = int(input("Select from the available options the size you want: "))
if pizza_size_choice not in [1, 2, 3]:
    print("Wrong entry. Make a new selection.")


print("Toppings available are;\n 1.Pepperoni, 2.Magarita, 3.Vegan, 4.Beef and Chicken")
pizza_flavor = int(input("Select your preferred toppings: "))

if  pizza_flavor not in [1, 2, 3, 4]:
    print("Wrong entry. Make a new selection.") 


cheese_option = input("Do you want extra cheese? Y or N.").upper()
if cheese_option not in ["Y", "N"]:
    cheese_option = 0;

Pizza_C = {1: 20, 2 : 30, 3 : 50}

Toppings_C = {1 : 20, 2 : 10, 3 : 15, 4 : 20}

Cheese_C = {"Y": 10, "N": 0}

total_price = Pizza_C[pizza_size_choice] + Toppings_C[pizza_flavor] + Cheese_C[cheese_option]
print(f"The total price of your order is {total_price}")




 