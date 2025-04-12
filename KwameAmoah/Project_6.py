def add(a, b):
    return a + b

def subtract(a, b):
    return a - b

def multiply(a, b):
    return a * b

def division(a, b):
    return a / b

operation_dict = {
    "+": add,
    "-": subtract,
    "*": multiply,
    "/": division
}

print("Welcome to the Python Calculator!\n")
first_num = float(input("Please input the first number: "))

continue_calculation = True

while continue_calculation:
    print("Here are your options:")
    for operator in operation_dict:
        print(operator)

    operator_selector = input("Pick an operation from the line above: ")

    second_num = float(input("Please input the next number: "))

    if operator_selector in operation_dict:
        operation = operation_dict[operator_selector]
        result = operation(first_num, second_num)
        print(f"{first_num} {operator_selector} {second_num} = {result}")
        first_num = result  
    else:
        print("Invalid operator, please enter one in the options")
        continue

    choice = input("\nWould you like to continue the calculation with the result? (y/n): ").lower()
    if choice != "y":
        continue_calculation = False
        print("Goodbye! Final result:", result)
