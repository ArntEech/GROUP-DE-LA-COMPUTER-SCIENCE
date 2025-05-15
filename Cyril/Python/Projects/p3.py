import random

rock = '''
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
'''

paper = '''
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)
'''

scissors = '''
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
'''


def __main__():
    print("""--Welcome to the simple 'Rock Paper Scissors' Game--
You will be playing against the one and only, the undefeated champion: THE COMPUTER !!!!
Good luck and remember to have fun!""")

    user_play = int(input("Rock, Paper, Scissors; Which of these will you choose? (0 for Rock, 1 for Scissors, 2 for Paper): "))
    
    if user_play not in [0, 1, 2]:
        print("Invalid choice. Please choose 0 for Rock, 1 for Scissors, or 2 for Paper.")
        return

    # Computer's choice
    computer_play = random.randint(0, 2)

    print("\nYou chose:")
    print(display_choice(user_play))

    print("\nTHE COMPUTER chose:")
    print(display_choice(computer_play))

    # Determine the winner
    determine_winner(user_play, computer_play)


def display_choice(choice):
    if choice == 0:
        return rock
    elif choice == 1:
        return scissors
    elif choice == 2:
        return paper


def determine_winner(user, computer):
    if user == computer:
        print("\nIt's a tie! Both chose the same.")
    elif (user == 0 and computer == 1) or (user == 1 and computer == 2) or (user == 2 and computer == 0):
        print("\nYou won!! THE COMPUTER lost!!")
        print("THE COMPUTER: 'Damn you!! I'll get you for this!'")
    else:
        print("\nYou lost!! THE COMPUTER won!!")
        print('THE COMPUTER: "Haha! Better luck next time, human!"')



__main__()