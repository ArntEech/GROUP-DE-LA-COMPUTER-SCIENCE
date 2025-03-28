#Love calculator

name1 = input("Enter your name: ").lower()
name2 = input("Enter your partner's name: ").lower()

combined_name = name1 + name2
combined_name_length = len(combined_name)
num_of_T = combined_name.count("t")
num_of_R = combined_name.count("r")
num_of_U = combined_name.count("u")
num_of_E = combined_name.count("e")

num_of_L = combined_name.count("l")
num_of_O = combined_name.count("o")
num_of_V = combined_name.count("v")
num_of_E2 = combined_name.count("e")

total_true = num_of_T + num_of_R + num_of_U + num_of_E
total_love = num_of_L + num_of_O + num_of_V + num_of_E2
Score = total_love + total_true

percentage_score = (Score / combined_name_length) * 100

if percentage_score < 10 or percentage_score > 90:
    print(f"Your score is {Score}, you go together like coke and mentos.")
elif percentage_score >= 40 and percentage_score <= 50:
    print(f"Your score is {Score}, you are alright together.")
else:
    print(f"Your score is {Score}.")