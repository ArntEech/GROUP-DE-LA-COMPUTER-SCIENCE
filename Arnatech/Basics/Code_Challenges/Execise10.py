# Exercise 11 - Pizza Order


# Accepting inputs for size, add_pepperoni and extra_cheese
print("Welcome to Python Pizza Deliveries!")
size = input("What size pizza do you want? S, M, or L ")
add_pepperoni = input("Do you want pepperoni? Y or N ")
extra_cheese = input("Do you want extra cheese? Y of N ")

# Default value for the bill
bill = 0 

# Condition for when size is S
if size == 'S':
    bill = 15
    if add_pepperoni == 'Y':
        bill += 2
    
# Condition for when size is M      
elif size == 'M':
    bill = 20
    if add_pepperoni == 'Y':
        bill += 3
        
# Condition for when size is L       
elif size == 'L':
    bill = 25
    if add_pepperoni == 'Y':
        bill += 3
if extra_cheese == 'Y':
    bill += 1
            
print(f"Your final bill is: ${bill}")   
