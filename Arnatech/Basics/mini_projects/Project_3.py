# Project 4 - Rock, Paper, Scissors

'''
Instructions:
Write a program that will randomly choose rock, paper or scissors based on the user's input

Rules of the Game:

Rock wins against scissors

Scissors wins against paper

Paper wins against rock

'''


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

print("------Weclome to the Rock, Paper, Scissiors game\nYou will be playing against with the one and only, the undefeated champion: THE COMPUTER !!!!\nGood Luck and remember to have fun ")

#Accepting the user input
Choice = int(input("Rock, Paper, Scissors; Which of these will you choose(0 for rock, 1 for scissors, 2 for paper)?\n "))
 
p_choices = [rock, scissors, paper]

i = random.randint(0,2)

com_choice = p_choices[i]
player_choice = p_choices[Choice]

g_message = ["You chose: " , "THE COMPUTER chose: "] #General message
w_message = ["You won!! ", "THE COMPUTER won!! "] #Wining message
l_message = ["You lost!! ", "THE COMPUTER lost!! "] #Losing message
t_message = "It's a tie!!" #Tie message
loser = ["C'mon is this the best you can do", "Even a baby is better than you", "Are you even trying at all; Punk !!", "You're the worst rock, paper, scissors player I have ever faced"]
winner =["Damn you!!", "I'll get you for this", "I know where you live", "You cheated; how can I, THE COMPUTER lose", "I what my mommieeeee"]
tie = ["Well played", "It seems there exist beings that could match my intelligence", "The system is buggy"]

print(f'''
{g_message[0]}\n{player_choice}   

{g_message[1]}\n{com_choice}   
    ''')

# Specifing the conditions 
if Choice == i:
    print(t_message)
    print("THE COMPUTER: ", random.choice(tie))
    
elif Choice == 0 and i == 1:
    print(f"{w_message[0]} and {l_message[1]}\nTHE COMPUTER: {random.choice(winner)}")

elif Choice == 1 and i == 2:
    print(f"{w_message[0]} and {l_message[1]}\nTHE COMPUTER: {random.choice(winner)}")

elif Choice == 2 and i == 0:
    print(f"{w_message[0]} and {l_message[1]}\nTHE COMPUTER: {random.choice(winner)}")

else:
    print(f'''
{w_message[1]} and {l_message[0]}
    
THE COMPUTER remains the undefeated CHAMPION !!!!!

THE COMPUTER: {random.choice(loser)}  
    ''')

