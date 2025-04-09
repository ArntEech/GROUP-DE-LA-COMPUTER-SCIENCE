#Rock, paper, Scissors challenge
import random

def greet():
    print("Welcome to the rock, paper, scissor game.\nI am your opponent. You get to "
    "choose either;\n Rock\n, Paper\n, Scissors\n. Then we dcide who wins.")
greet()
choices = ["Rock", "Paper", "Scissors"]
user_choice = input("Input your choice:\n").capitalize()

comp_choice = random.choice(choices)

print(f"You chose {user_choice}")
print(f"I chose {comp_choice}")

def Win_Msg():
    print("Congratulations, You beat an all time champion.")

def Lose_Msg():
    print("You Lost! So sad. Better luck next time")

def Tie_Msg():
    print("Oops, seems we have a tie. Let roll again.")

if user_choice == "Rock" and comp_choice == "Scissors":
    Win_Msg()
    print("COMPUTER: DARN IT, you won!")
elif user_choice == "Scissors." and comp_choice == "Rock":
    Lose_Msg()
    print("COMPUTER: Yayy, I won and you're the loser.")
elif user_choice == "Scissors" and comp_choice == "Paper":
    Win_Msg()
    print("COMPUTER: Noooo, You won against me!")
elif user_choice == "Paper" and comp_choice == "Scissors":
    Lose_Msg()
    print("COMPUTER: Guess today is not your day Buddy. Sorry!")
elif user_choice == "Paper" and comp_choice == "Rock":
    Win_Msg()
    print("COMPUTER: You definately won't get the last laugh.")
elif user_choice == "Rock" and comp_choice == "Paper":
    Lose_Msg()
    print("COMPUTER: Hahaha, Gat ya.")
elif user_choice == comp_choice:
    Tie_Msg()
else: 
    print("Oops, seems there's something wrong with the input. Try again")
