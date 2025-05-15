# Exercise 34 - Draw Overlaid Shapes
from turtle import Turtle, Screen

def overlaid(object):
    pen = ["red", "yellow", "green", "blue", "violet", "orange", "cyan", "brown"]
    a = [120, 90, 72, 60, 51, 45, 40, 36]
        
    #Drawing Traingle
    object.pencolor(pen[0])
    for t in range(3):
        object.forward(100)
        object.left(a[0]) #turn left 120 degrees

    #Drawing Square
    object.pencolor(pen[1])
    for s in range(4):
        object.forward(100)
        object.left(a[1]) 
    
    #Drawing pentagon
    object.pencolor(pen[2])
    for p in range(5):
        object.forward(100)
        object.left(a[2])
    
    #Drawing hexagon
    object.pencolor(pen[3])
    for hx in range(6):
        object.forward(100)
        object.left(a[3]) 
        
    #Drawing heptagon
    object.pencolor(pen[4])
    for hp in range(7):
        object.forward(100)
        object.left(a[4])
    
    #Drawing octagon
    object.pencolor(pen[5])
    for o in range(8):
        object.forward(100)
        object.left(a[5])
        
    #Drawing nonagon
    object.pencolor(pen[6])
    for n in range(9):
        object.forward(100)
        object.left(a[6])
    
    #Drawing decagon
    object.pencolor(pen[7])
    for d in range(10):
        object.forward(100)
        object.left(a[7])
        



t_knucle = Turtle()
overlaid(t_knucle)

screen = Screen()
screen.exitonclick()