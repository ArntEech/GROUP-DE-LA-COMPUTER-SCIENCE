# Exercise 33 - Draw a Dashed Line
from turtle import Turtle, Screen

def draw_dashedline(object):
    for i in range(15): # Repeat the process 15 times
        object.forward(10)
        object.penup()
        object.forward(10)
        object.pendown()

t_claw = Turtle()
draw_dashedline(t_claw)

screen = Screen()
screen.exitonclick()