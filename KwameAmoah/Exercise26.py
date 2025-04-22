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
scores_ratings = {}

# 🚀 TODO-2: Write your logic below to populate the new dataset. 👇
for element in scores_data:
    if 91 <= scores_data[element] <= 100:
        scores_data[element] = "Outstanding"
    elif 81 <= scores_data[element] <= 90:
        scores_data[element] = "Exceeds Expectations"
    elif 71 <= scores_data[element] <= 80:
        scores_data[element] = "Acceptable"
    else:
        scores_data[element] = "Fail"


print(scores_data)

