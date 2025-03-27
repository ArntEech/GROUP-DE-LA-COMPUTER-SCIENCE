## Exercise 18 - Adding Even Numbers

'''
Instructions:

+ Write a program that calculates the sum of all the even numbers from 1 t0 100

+ There should only be one print statement in your console output. It should just print the final total and not every step of the calculation



'''
sum_total = 0
for num in range (2, 101, 2):
    sum_total += num
print(sum_total)