two_digit_number = input("Enter a two-digit number: ")

if len(two_digit_number) != 2 or not two_digit_number.isdigit():
    print("Invalid input. Please enter a valid two-digit number.")
else:
    digit1 = int(two_digit_number[0])
    digit2 = int(two_digit_number[1])
    result = digit1 + digit2

    print(f"The sum of the digits {digit1} + {digit2} = {result}")