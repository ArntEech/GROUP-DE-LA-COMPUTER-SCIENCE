logo = """
 _____________________
|  _________________  |
| | Codinista   0. | |  .----------------.  .----------------.  .----------------.  .----------------. 
| |_________________| | | .--------------. || .--------------. || .--------------. || .--------------. |
|  ___ ___ ___   ___  | | |     ______   | || |      __      | || |   _____      | || |     ______   | |
| | 7 | 8 | 9 | | + | | | |   .' ___  |  | || |     /  \     | || |  |_   _|     | || |   .' ___  |  | |
| |___|___|___| |___| | | |  / .'   \_|  | || |    / /\ \    | || |    | |       | || |  / .'   \_|  | |
| | 4 | 5 | 6 | | - | | | |  | |         | || |   / ____ \   | || |    | |   _   | || |  | |         | |
| |___|___|___| |___| | | |  \ `.___.'\  | || | _/ /    \ \_ | || |   _| |__/ |  | || |  \ `.___.'\  | |
| | 1 | 2 | 3 | | x | | | |   `._____.'  | || ||____|  |____|| || |  |________|  | || |   `._____.'  | |
| |___|___|___| |___| | | |              | || |              | || |              | || |              | |
| | . | 0 | = | | / | | | '--------------' || '--------------' || '--------------' || '--------------' |
| |___|___|___| |___| |  '----------------'  '----------------'  '----------------'  '----------------' 
|_____________________|
"""

print(logo)

def add(n1, n2):
    return n1 + n2

def subtract(n1, n2):
    return n1 - n2

def multiply(n1, n2):
    return n1 * n2

def divide(n1, n2):
    if n2 == 0:
        return "Error: Division by zero"
    return n1 / n2

def power(n1, n2):
    return n1 ** n2

operations = {
    "+": add,
    "-": subtract,
    "*": multiply,
    "/": divide,
    "^": power
}

def calculator():
    while True:
        num1 = float(input("Enter the first number: "))
        cont = True

        while cont:
            print("\nAvailable operations:")
            for symbol in operations:
                print(symbol)
            
            operation = input("Pick an operation: ")
            num2 = float(input("What's the next number?: "))

            func = operations.get(operation)
            if func:
                result = func(num1, num2)
                print(f"{num1} {operation} {num2} = {result}")
            else:
                print("Invalid operation selected.")
                break

            choice = input(f"Type 'y' to continue calculating with {result}, or 'n' to start a new calculation: ").lower()
            if choice == 'y':
                num1 = result if isinstance(result, (int, float)) else 0
            else:
                cont = False
                print("\n--- New calculation ---\n")

calculator()
