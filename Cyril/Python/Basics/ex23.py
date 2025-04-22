def countDigits(number):
    return len(str(number))

digit = int(input("Enter a number to count digits: "))
print(f"The number {digit} has {countDigits(digit)} digits.")

