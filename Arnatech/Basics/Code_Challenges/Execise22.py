# Exercise 22 - Multiplication Table Generator

def multiple_table(N):
    for n in range (1, 11):
        multiple = N * n
        print(f"{N} x {n} = {multiple}")
        
num = int(input("Enter a number: "))
multiple_table(num)