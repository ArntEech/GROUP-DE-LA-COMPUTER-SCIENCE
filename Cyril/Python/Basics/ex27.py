
scores_data = {
    "Harry": 81,
    "Ron": 78,
    "Hermione": 99,
    "Draco": 74,
    "Neville": 62,
}

performance_ratings = {}

for name, score in scores_data.items():
    if 91 <= score <= 100:
        performance_ratings[name] = "Outstanding"
    elif 81 <= score <= 90:
        performance_ratings[name] = "Exceeds Expectations"
    elif 71 <= score <= 80:
        performance_ratings[name] = "Acceptable"
    else:
        performance_ratings[name] = "Fail"
