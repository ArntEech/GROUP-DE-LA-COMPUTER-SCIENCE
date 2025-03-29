# Exercise 17 - Highest Score


# Accepting the students scores and converting them into integers
student_scores = input("Enter a list of student scores: ").split()
for n in range(0, len(student_scores)):
    student_scores[n] = int(student_scores[n])
print(student_scores)    


Highest_score = 0

for score in student_scores:
    if score > Highest_score:
        Highest_score = score
print(f"The Highest score is: {Highest_score}")
        
    