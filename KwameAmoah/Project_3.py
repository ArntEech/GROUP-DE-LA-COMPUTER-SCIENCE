import random

rock = '''
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
'''

scissors = '''
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)
'''

paper = '''
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
'''

ascii_art = [rock, scissors, paper]

print("Welcome to Rock, Paper, Scissors! Have fun :)\n")

mockery = [
    "Was that a move or a cry for help?",
    "Beep boop... detecting zero threat.",
    "You bring a rock to a logic fight? Cute.",
    "If I had feelings, I’d feel bad for you. Luckily, I’m optimized for winning.",
    "You really thought that would work? Adorable.",
    "I’ve seen better strategies from a toaster.",
    "Did you just randomly pick? Because... it shows.",
    "Error 404: Your win not found.",
    "I'm starting to think you're training *me* to get better.",
    "Even Clippy could’ve beaten you, and he’s been retired since 2001."
]

choice = int(input("Who would you like to play as? 0 for Rock, 1 for Scissors, 2 for Paper:\n"))

if choice < 0 or choice > 2:
    print("Invalid choice. Please pick 0, 1, or 2.")
else:
    comp_choice = random.randint(0, 2)

    print("\nYou chose:")
    print(ascii_art[choice])

    print("The computer chose:")
    print(ascii_art[comp_choice])

    
    if choice == comp_choice:
        print("It's a tie!")

    elif (choice == 0 and comp_choice == 1) or \
         (choice == 1 and comp_choice == 2) or \
         (choice == 2 and comp_choice == 0):
        print("You win!")

    else:
        print(random.choice(mockery))
