# Function to print the multiplication table of a number
def multiplicationTable(n):
    for i in range(1, 11):
        print(f"{n} x {i} = {n * i}")


n = int(input("Enter a number for multiplication table: "))
multiplicationTable(n)