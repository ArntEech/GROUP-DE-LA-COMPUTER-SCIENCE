# DAY FIVE - LOOPS AND THIER OPERATIONS

## Exercise 16 - Average Height

**Instructions:**

- Write a program that calculates the average student height from a List/array of heights

- The Average height should to rounded to the nearest whole number

- For extra challenge don't use special functions like sum and len; only use for loop.

- Example:

Input:

Enter your list of heights (seperated by a space) : 156 178 165 171 187

Output:

171

**Starting code:(Type your programming language equivalent of the starting code )**

**Don't change the code below**

student_heights = input("Input a list of student heights ").split()

for n in range (0 , len(student_heights)):

    student_heights[n] = int(student_heights[n])

print(student_heights)

**Don't change the code above**

## Exercise 17 - High Score

**Instructions:**

- Write a program that calculates the highest score from a list/array of scores

- You are not allowed to use the max or min functions.

- Example:

Input:

78 65 89 86 55 91 64 89

Output:

The Highest score in the class is: 91

## Exercise 18 - Adding Even Numbers

**Instructions:**

- Write a program that calculates the sum of all the even numbers from 1 t0 100

- There should only be one print statement in your console output.

- It should just print the final total and not every step of the calculation

## Exercise 19 - FizzBuzz

**Instructions:**

- Write a program that automatically prints the solution to the FizzBuzz game

- Your program should print each number from 1 to 100 in turn.

- When the number is divisible by 3 then instead of printing the number, it should print "Fizz"

- When the number is divisible by 5 then instead of printing the number, it should print "Buzz"

- And if the number is divisible by both 3 and 5 e.g. 15 then instead of the number it should print "FizzBuzz"

Example Output:
1

2

Fizz

4

Buzz

Fizz

7

8

Fizz

Buzz

11

Fizz

13

14

FizzBuzz
