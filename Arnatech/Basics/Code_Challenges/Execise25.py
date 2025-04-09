# Exercise 25 - Paint Area Calculator


# Defining the paint_calc function
import math

def paint_calc(height, width, cover):
    area = height * width
    cans_num = math.ceil(area/cover) # Rounds up the number of cans to the nearest number
    print(f"You'll need {cans_num} cans of paint")



test_h = int(input("Height of wall: "))
test_w = int(input("Width of wall: "))
coverage = 5
paint_calc(height = test_h, width = test_w, cover = coverage)