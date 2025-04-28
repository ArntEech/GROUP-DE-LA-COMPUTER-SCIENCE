import math
#paint area calculator

###A can can paint 5m*m area

Height = float(input("What is the height of the wall?: "))
Width = float(input("What is the width of the wall?: "))

area = int(Height * Width)
print(f"Your total area is {area}")

number_of_paints = math.ceil(area / 5) 

print(f"You will need {number_of_paints} cans of paint to paint the wall.")

