import time

print('''
*******************************************************************************
          |                   |                  |                     |
 _________|________________.=""_;=.______________|_____________________|_______
|                   |  ,-"_,=""     `"=.|                  |
|___________________|__"=._o`"-._        `"=.______________|___________________
          |                `"=._o`"=._      _`"=._                     |
 _________|_____________________:=._o "=._."_.-="'"=.__________________|_______
|                   |    __.--" , ; `"=._o." ,-"""-._ ".   |
|___________________|_._"  ,. .` ` `` ,  `"-._"-._   ". '__|___________________
          |           |o`"=._` , "` `; .". ,  "-._"-._; ;              |
 _________|___________| ;`-.o`"=._; ." ` '`."\` . "-._ /_______________|_______
|                   | |o;    `"-.o`"=._``  '` " ,__.--o;   |
|___________________|_| ;     (#) `-.o `"=.`_.--"_o.-; ;___|___________________
____/______/______/___|o;._    "      `".o|o_.--"    ;o;____/______/______/____
/______/______/______/_"=._o--._        ; | ;        ; ;/______/______/______/_
____/______/______/______/__"=._o--._   ;o|o;     _._;o;____/______/______/____
/______/______/______/______/____"=._o._; | ;_.--"o.--"_/______/______/______/_
____/______/______/______/______/_____"=.o|o_.--""___/______/______/______/____
/______/______/______/______/______/______/______/______/______/______/_____ /
*******************************************************************************
''')
print("Welcome to Treasure Island.")
print("Your mission is to find the treasure.\n")

print("Your journey begins in Skullcrank town. However, beware: pirates are after you. The choice is yours....")

town_journey = input("You try looking for a ship. There’s:\n  a) a run-down one with suspicious creaking sounds\n  b) a fancy, high-maintenance beauty with velvet sails\nWhich one do you set sail on? (a/b): ")

if town_journey == "a":
    print("\nCongrats, you chose the run-down ship. Turns out, it's captained by a retired pirate chef named Captain Crabcake.")
    print("He smells like rum and roasted garlic, but boy, he can steer through a storm blindfolded.")
elif town_journey == "b":
    print("\nOkay...you got a pretty swanky ship, but tensions are high among the crew. They’re more into manicures than mutinies...")
    print("...but wait — they just tried to *stage* a mutiny over who gets the bigger cabin! You barely escape with your dignity intact.")

time.sleep(2)
print("\nYou sail for days. One morning, your lookout (who’s really just a goat in a bandana) spots something...")

island_choice = input("You see two islands:\n  a) One covered in dense jungle with smoke rising\n  b) One sunny with sparkling beaches and suspiciously happy music playing\nWhere do you land? (a/b): ")

if island_choice == "a":
    print("\nYou land in the jungle island. The smoke? Just a bunch of monkeys having a BBQ.")
    print("They invite you, give you banana kebabs, and hand you a map! Jackpot.")
elif island_choice == "b":
    print("\nYou land on the sunny beach... where you’re immediately swarmed by musical crabs.")
    print("They dance. And then they steal your boots. And then your map. Not ideal.")

time.sleep(2)
print("\nWith the map (or your memory if the crabs got it), you reach a fork in the trail.")

trail_choice = input("Do you take:\n  a) The path that smells like wet socks\n  b) The one lined with glowing mushrooms\nWhich do you choose? (a/b): ")

if trail_choice == "a":
    print("\nYou follow the sock path. Turns out, it leads to an old fisherman named Old Stinky Pete.")
    print("He trades you a key for one of your socks. Seems like a win?")
elif trail_choice == "b":
    print("\nThe mushrooms were glowing because... they’re mildly radioactive. You grow a second toe on your elbow.")
    print("But hey — under one mushroom is a *clue* pointing to a cave.")

time.sleep(2)
print("\nEventually, you reach a giant stone door with a riddle inscribed on it:")

riddle_answer = input("“I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?”\nYour answer: ").strip().lower()

if riddle_answer == "echo":
    print("\nThe door creaks open slowly. Inside is a sparkling cavern filled with gold, gems, and... a ukulele.")
    print("You take the treasure and the ukulele. You're now rich *and* musically dangerous.")
    print("\n YOU FOUND THE TREASURE! The legend lives on! ")
else:
    print("\nWRONG! A trapdoor opens and you fall into a pit filled with glitter and regret.")
    print("Better luck next time, brave soul.")

print("\nThanks for playing Treasure Island! May your next adventure be just as bizarre.")
