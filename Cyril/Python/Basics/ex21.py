# Function to calculate the sum of numbers from 1 to n
def sum_of_numbers(n):
    total = 0
    for i in range(1, n + 1):
        total += i
    return total


n = int(input("Enter a number: "))
print(f"The sum of numbers from 1 to {n} is: {sum_of_numbers(n)}")