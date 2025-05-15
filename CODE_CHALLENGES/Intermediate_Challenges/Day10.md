# Day 10 ☕ OOP Challenge: Coffee Machine 

Welcome to your first **intermediate-level** challenge! 🎉  
We're now moving from beginner to intermediate by exploring the powerful world of **Object-Oriented Programming (OOP)**.

This challenge is designed to help you convert a **procedural coffee machine program** into a modular, scalable **OOP-based system**, making your code more readable, reusable, and extensible.

---

## 🔍 The Task

You’ve been given a **non-OOP (procedural)** coffee machine program (see below).  
Your job is to **refactor** this logic into a **main program** that uses **three separate OOP-based modules**:

### ✅ Provided Modules

You're **NOT allowed to modify** the following modules. You will use them **as-it-is** by importing them into your main program:

| Module Name      | Description                                                                 |
|------------------|-----------------------------------------------------------------------------|
| `coffee_maker`   | Handles resources and brewing logic                                         |
| `menu`           | Contains the available drink options and their ingredients/cost            |
| `money_machine`  | Handles coin processing and transactions                                    |

Each of these modules has already been written in **Python**, but you are free to **recreate them in any programming language** (e.g., Java, C++, JavaScript, etc.), **as long as their structure and functionality remain unchanged**.

---

## 🧠 Original Procedural Version (For Reference)

Here’s the structure of the original procedural version of the coffee machine. Your OOP version must replicate this logic, but in a modular form.

```python
MENU = {
    "espresso": {
        "ingredients": {
            "water": 50,
            "coffee": 18,
        },
        "cost": 15.0,  # GH₵15.00
    },
    "latte": {
        "ingredients": {
            "water": 200,
            "milk": 150,
            "coffee": 24,
        },
        "cost": 25.0,  # GH₵25.00
    },
    "cappuccino": {
        "ingredients": {
            "water": 250,
            "milk": 100,
            "coffee": 24,
        },
        "cost": 30.0,  # GH₵30.00
    }
}

profit = 0
resources = {
    "water": 300,
    "milk": 200,
    "coffee": 100,
}


def is_resource_sufficient(order_ingredients):
    """Returns True when order can be made, False if ingredients are insufficient."""
    for item in order_ingredients:
        if order_ingredients[item] > resources[item]:
            print(f"​Sorry there is not enough {item}.")
            return False
    return True


def process_coins():
    """Returns the total calculated from Ghanaian coins inserted."""
    print("Please insert coins.")
    total = int(input("How many 1 cedi coins?: ")) * 1.0
    total += int(input("How many 50 pesewa coins?: ")) * 0.5
    total += int(input("How many 20 pesewa coins?: ")) * 0.2
    total += int(input("How many 10 pesewa coins?: ")) * 0.1
    return total


def is_transaction_successful(money_received, drink_cost):
    """Return True when the payment is accepted, or False if money is insufficient."""
    if money_received >= drink_cost:
        change = round(money_received - drink_cost, 2)
        print(f"Here is GH₵{change} in change.")
        global profit
        profit += drink_cost
        return True
    else:
        print("Sorry, that's not enough money. Money refunded.")
        return False


def make_coffee(drink_name, order_ingredients):
    """Deduct the required ingredients from the resources."""
    for item in order_ingredients:
        resources[item] -= order_ingredients[item]
    print(f"Here is your {drink_name} ☕️. Enjoy!")


is_on = True

while is_on:
    choice = input("​What would you like? (espresso/latte/cappuccino): ").lower()
    if choice == "off":
        is_on = False
    elif choice == "report":
        print(f"Water: {resources['water']}ml")
        print(f"Milk: {resources['milk']}ml")
        print(f"Coffee: {resources['coffee']}g")
        print(f"Money: GH₵{profit}")
    elif choice in MENU:
        drink = MENU[choice]
        if is_resource_sufficient(drink["ingredients"]):
            payment = process_coins()
            if is_transaction_successful(payment, drink["cost"]):
                make_coffee(choice, drink["ingredients"])
    else:
        print("Invalid choice. Please choose espresso, latte, or cappuccino.")

```
# 🧩 Your Challenge
1. Recreate the three modules (Menu/MenuItem, CoffeeMaker, and MoneyMachine) in your language of choice.

2. Write a main program that:

  - Displays a menu (espresso, latte, cappuccino)
  - Accepts user commands: off, report, or a drink name
  - Checks resources and drink availability
  - Processes coin input
  - Dispenses coffee and gives change

3. Import and use the 3 modules in your main file without altering their internal structure.

# 🔐 Rules

❌ Do not modify the logic of the provided modules (even if you translate them into another language).

✅ Your main program must import and use the classes appropriately.

⚠️ The functionality of your OOP version must match the procedural version.

# 🧪 Sample Interaction
```vbnet
What would you like? (espresso/latte/cappuccino): latte
Please insert coins.
How many 1 cedi coins?: 1
How many 50 pesewa coins?: 1
How many 20 pesewa coins?: 0
How many 10 pesewa coins?: 0
Sorry, that's not enough money. Money refunded.
What would you like? (espresso/latte/cappuccino): report
Water: 300ml
Milk: 200ml
Coffee: 100g
Money: GH₵0
​What would you like? (espresso/latte/cappuccino):

```
# Starting Code (modify to meet your programming language syntax)

## `main` file
```python
from menu import Menu, MenuItem
from coffee_maker import CoffeeMaker
from money_machine import MoneyMachine

```

##  `coffee_maker` file
```python
class CoffeeMaker:
    """Models the machine that makes the coffee"""
    def __init__(self):
        self.resources = {
            "water": 300,
            "milk": 200,
            "coffee": 100,
        }

    def report(self):
        """Prints a report of all resources."""
        print(f"Water: {self.resources['water']}ml")
        print(f"Milk: {self.resources['milk']}ml")
        print(f"Coffee: {self.resources['coffee']}g")

    def is_resource_sufficient(self, drink):
        """Returns True when order can be made, False if ingredients are insufficient."""
        can_make = True
        for item in drink.ingredients:
            if drink.ingredients[item] > self.resources[item]:
                print(f"Sorry there is not enough {item}.")
                can_make = False
        return can_make

    def make_coffee(self, order):
        """Deducts the required ingredients from the resources."""
        for item in order.ingredients:
            self.resources[item] -= order.ingredients[item]
        print(f"Here is your {order.name} ☕️. Enjoy!")
```

## `money_machine` file
```python
class MoneyMachine:

    CURRENCY = "₵"

    COIN_VALUES = {
        "1 cedi coins": 1.00,
        "50 pesewa coins": 0.50,
        "20 pesewa coins": 0.20,
        "10 pesewa coins": 0.10
    }

    def __init__(self):
        self.profit = 0
        self.money_received = 0

    def report(self):
        """Prints the current profit"""
        print(f"Money: {self.CURRENCY}{self.profit}")

    def process_coins(self):
        """Returns the total calculated from coins inserted."""
        print("Please insert coins.")
        self.money_received = 0  # Reset before each transaction
        for coin in self.COIN_VALUES:
            self.money_received += int(input(f"How many {coin}?: ")) * self.COIN_VALUES[coin]
        return self.money_received

    def make_payment(self, cost):
        """Returns True when payment is accepted, or False if insufficient."""
        self.process_coins()
        if self.money_received >= cost:
            change = round(self.money_received - cost, 2)
            print(f"Here is {self.CURRENCY}{change} in change.")
            self.profit += cost
            self.money_received = 0
            return True
        else:
            print("Sorry that's not enough money. Money refunded.")
            self.money_received = 0
            return False
```

## `menu` file
```python
class MenuItem:
    """Models each Menu Item."""
    def __init__(self, name, water, milk, coffee, cost):
        self.name = name
        self.cost = cost
        self.ingredients = {
            "water": water,
            "milk": milk,
            "coffee": coffee
        }


class Menu:
    """Models the Menu with drinks."""
    def __init__(self):
        self.menu = [
            MenuItem(name="latte", water=200, milk=150, coffee=24, cost=25.0),
            MenuItem(name="espresso", water=50, milk=0, coffee=18, cost=15.0),
            MenuItem(name="cappuccino", water=250, milk=50, coffee=24, cost=30.0),
        ]

    def get_items(self):
        """Returns all the names of the available menu items"""
        options = ""
        for item in self.menu:
            options += f"{item.name}/"
        return options

    def find_drink(self, order_name):
        """Searches the menu for a particular drink by name. Returns that item if it exists, otherwise returns None"""
        for item in self.menu:
            if item.name == order_name:
                return item
        print("Sorry that item is not available.")

```

# 🔚 Submission Guidelines

✅ Create a folder called `Exercise30`, and store your modules and the main file inside; push to the general repo when finished.

📌 Make sure your code is clean and commented

For a better understanding of this challenges, you can check out the attached pdfs which contain the coffee machine requirements and the three modules discriptions.

Ready? Go brew some code! ☕🚀

Happy coding, team!

