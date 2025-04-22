input_heights = input("Enter your list of heights (separated by a space): ").strip().split()

student_heights = [int(height) for height in input_heights]

total_height = sum(student_heights)
num_students = len(student_heights)

average_height = round(total_height / num_students)

print(average_height)