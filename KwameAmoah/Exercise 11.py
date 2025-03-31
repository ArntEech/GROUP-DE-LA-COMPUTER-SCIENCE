your_name = (input("What is your name?:")).upper()
their_name = (input("What is their name?:")).upper()

both_names = your_name + their_name



true_count = str(both_names.count("T") + both_names.count("R") + both_names.count("U") + both_names.count("E"))
love_count = str(both_names.count("L") + both_names.count("O") + both_names.count("V") + both_names.count("E"))


percentage = true_count + love_count
percentage = int(percentage)

if percentage < 10 or percentage > 90:
    print("Your score is {}, You go together like coke and mentos!".format(percentage))
elif 40 <= percentage <= 50:
    print("Your score is {}, You are alright together".format(percentage))
else:
    print("Your score is {},".format(percentage))
    


