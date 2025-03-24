# Exercise 16 - Average Height


**Instructions:**

+ Write a program that calculates the average student height from a List/array of heights

+ The Average height should to rounded to the nearest whole number

+ For extra challenge don't use special functions like sum and len; only use for loop.

+ Example:

Input:

Enter your list of heights (seperated by a space) : 156 178 165 171 187


Output:

171

'''

# Starting code:(Type your programming language equivalent of the starting code )

# Don't change the code below
student_heights = input("Input a list of student heights ").split()
for n in range (0 , len(student_heights)):
    student_heights[n] = int(student_heights[n])
print(student_heights)
# Don't change the code above
