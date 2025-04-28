#Exercise 32 - Draw a Square
from turtle import Turtle, Screen

def draw_square(object):
    for i in range(0, 4):
        object.forward(100) #Move forward by 100 centemeters
        object.left(90) #Turn left at a 90 degrees angle
    
    

t_bone = Turtle()
draw_square(t_bone)
