#highest number in a  range or list

scores = input("Enter a list of numbers:\n").split()

highest_score = scores[0]

for score in scores:
    if score > highest_score:
        highest_score = score
print(highest_score)
