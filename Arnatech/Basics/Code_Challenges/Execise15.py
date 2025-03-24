# Exercise 15 - Treasure Map.

# 🚨 Don't change the code below 👇
row1 = ["⬜️","⬜️","⬜️"]
row2 = ["⬜️","⬜️","⬜️"]
row3 = ["⬜️","⬜️","⬜️"]
map = [row1, row2, row3]
print(f"{row1}\n{row2}\n{row3}")
position = input("Where do you want to put the treasure? ")
# 🚨 Don't change the code above 👆

#Write your code below this row 👇
h = int(position[0])
v = int(position[1])

'''
#finding the row specified
sp_row = map[v-1]

#Replacing a member in the specified row with 'X' using the column number as index ( h-1 )
sp_row[h-1] = 'X'

'''

#Optimized Version
map[v-1][h-1] = 'X'



#Write your code above this row 👆

# 🚨 Don't change the code below 👇
print(f"{row1}\n{row2}\n{row3}")