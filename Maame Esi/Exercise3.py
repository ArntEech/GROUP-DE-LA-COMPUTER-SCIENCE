# Write a program that **counts the number of characters** in a user’s name. 

name = input('add name ')

count=0
for i in name: 
    if i.isalnum(): 
        count += 1

print(count)

