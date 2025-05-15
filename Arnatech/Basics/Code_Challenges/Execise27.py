## 🏆 Exercise 27 - Grading Program 📊 

# Sample dataset (🚨 DO NOT modify)
scores_data = {
    "Harry": 81,
    "Ron": 78,
    "Hermione": 99,
    "Draco": 74,
    "Neville": 62,
}
# 🚨 Do not change the code above 👆

# 📝 TODO-1: Create an empty dataset to store the converted ratings.
students_grade = {}

# 🚀 TODO-2: Write your logic below to populate the new dataset. 👇
rating = ["Outstanding", "Exceeds Expections", "Acceptable", "Fail"]
for data in scores_data:
    if scores_data[data] in range(91, 101):
        students_grade[data] = rating[0]
    elif scores_data[data] in range(81, 91):
        students_grade[data] = rating[1]
    elif scores_data[data] in range(71, 81):
        students_grade[data] = rating[2]
    else:
        students_grade[data] = rating[3]
        

print(students_grade)
