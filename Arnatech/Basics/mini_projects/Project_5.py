#Project 3 - Treasure Island 

print('''
                    |>>>                        |>>>
                    |                           |
                _  _|_  _                   _  _|_  _
               | |_| |_| |                 | |_| |_| |
               \  .      /                 \ .    .  /
                \    ,  /                   \    .  /
                 | .   |_   _   _   _   _   _| ,   |
                 |    .| |_| |_| |_| |_| |_| |  .  |
                 | ,   | .    .     .      . |    .|
                 |   . |  .     . .   .  ,   |.    |
     ___----_____| .   |.   ,  _______   .   |   , |---~_____
_---~            |     |  .   /+++++++\    . | .   |         ~---_
                 |.    | .    |+++++++| .    |   . |              ~-_
              __ |   . |   ,  |+++++++|.  . _|__   |                 ~-_
     ____--`~    '--~~__ .    |++++ __|----~    ~`---,              ___^~-__
-~--~                   ~---__|,--~'                  ~~----_____-~'   `~----~                                                                         

      ''')

print("Welcome to Treasure Island.")
print("Your mission is to find the treasure.") 


#Write your code below this line
path = input("You've come across two paths; one is big and broad with no obstacles(Left), the other is narrow and full of hardships[Right].Choose where to proceed:\n ")

#Determining the outcome based on the input
if path == 'Right':
      path_2 = input("You came across a river with a small boat. You meet an old woman who uses the boat.Wait or Swim:\n  ")
      if path_2 == 'Wait':
            door = input("After waiting for the boat, you board it to the other side of the river where you see a big Castle with 3 colored doors(Red, Blue, and Yellow). Which door will you choose:\n ")
            if door == 'Red':
                  print("Burned by FIRE!. GAME OVER !!!")
            elif door == 'Yellow':
                  print("Congratulations, you've acquired the tresure. YOU WIN !!!")
            elif door == 'Blue':
                  print("Eaten by ORCS!, GAME OVER !!!")
            else:
                  print("GAME OVER !!!")
      else:
            print("Attacked by a Levaitain!. GAME OVER !!! ")
else:
      print("Captured by DEMONS!. GAME OVER !!!")