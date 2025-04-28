#city visits
scores_data = {
    "Harry": 81,
    "Ron": 78,
    "Hermione": 99,
    "Draco": 74,
    "Neville": 62,
}

def ratings(score):
    if score >= 91:
        return "Outstanding"
    elif score >= 81:
        return "Exceeds expectation"
    elif score >= 71:
        return "Acceptable"
    else:
        return "Fail"


for key in scores_data:
    scores_data[key] = ratings(scores_data[key])

      








