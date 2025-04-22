input_scores = input("Enter the scores (separated by a space): ").strip().split()

scores = [int(score) for score in input_scores]

highest_score = scores[0]

for score in scores:
    if score > highest_score:
        highest_score = score

print(f"The highest score in the class is: {highest_score}")