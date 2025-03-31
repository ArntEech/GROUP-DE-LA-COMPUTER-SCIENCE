# Exercise 16 - Average Height


# Don't change the code below
student_heights = input("Input a list of student heights ").split()
for n in range (0 , len(student_heights)):
    student_heights[n] = int(student_heights[n])
print(student_heights)
# Don't change the code above


Total_height = 0
number_of_heights = 0

for num in student_heights:
   number_of_heights += 1
   Total_height += num
   average = round(Total_height/number_of_heights)
print(average)

