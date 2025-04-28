# Execise 12 - Love Calculator Exercise

#Accepting the user's input
name_1 = input("What is your name?\n")
name_2 = input("What is thier name\n")

#Combining and Converting the names to lowercase
combined_name = name_1 + name_2
L_name = combined_name.lower()

#Checking all the occurences of the letters in TRUE in the given names
T = L_name.count('t') 
R = L_name.count('r')
U = L_name.count('u') 
E = L_name.count('e') 

#Checking all the occurences of the letters in LOVE in the given names
L = L_name.count('l') 
O = L_name.count('o') 
V = L_name.count('v') 
E = L_name.count('e') 

#Total TRUE letters occurance in the names given
true_occurance = T + R + U + E

#Total LOVE letters occurance in the names given
love_occurance = L + O + V + E

#Getting the love score
love_score = int(str(true_occurance) + str(love_occurance))


#Specifying the message displayed depending on the love score
if love_score < 10 or love_score > 90:
    print(f"Your score is {love_score}, you go together like coke and mentos.")
    
elif love_score > 40 and love_score < 50:
    print(f"Your score is {love_score}, you are alright together")

else:
    print(f"Your score is {love_score}.")







