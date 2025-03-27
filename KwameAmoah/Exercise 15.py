student_heights = input("Enter your list of heights:").split()


for n in range(0, len(student_heights)):
    student_heights[n] = int(student_heights[n])

sum = 0
for n in range(0, len(student_heights)):
    sum += student_heights[n]

print(round(sum/len(student_heights)))

