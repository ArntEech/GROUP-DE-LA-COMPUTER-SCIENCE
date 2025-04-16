# Exercise 21 - Sum of All Numbers
def sum_num(N):
    sum = 0
    for n in range(1,N+1):
        sum += n
    print(f"The sum of numbers from 1 to {N} is: {sum}")
    
num = int(input("Enter a number: "))
sum_num(num)
