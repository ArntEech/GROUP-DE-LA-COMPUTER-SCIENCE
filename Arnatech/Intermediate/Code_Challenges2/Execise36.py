# Exercise 34 - Draw a Spirograph

import turtle as t
import random as rd

t.colormode(255)

def random_color():
    r = rd.randint(0, 255)
    g = rd.randint(0,255)
    b = rd.randint(0,255)
    rgb = (r, g, b)
    return rgb


def draw_spirograph(object):
    object.speed("fastest")
    for i in range(200):
        object.color(random_color())
        object.circle(100)
        object.right(5)
    

t_spiral = t.Turtle()
draw_spirograph(t_spiral)

screen = t.Screen()
screen.exitonclick()