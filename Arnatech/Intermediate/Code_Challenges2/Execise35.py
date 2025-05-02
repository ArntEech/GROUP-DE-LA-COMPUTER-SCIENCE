# Exercise 45 - Draw a Random Walk
import turtle as t

t_wack = t.Turtle()
pen = ["red", "blue", "green", "yellow", "purple", "orange", "pink", "brown", "black", "white", "cyan", "magenta", "gray", "gold", "silver", "lightblue", "navy", "lime", "maroon", "olive", "teal", "turquoise", "violet", "indigo", "chocolate", "coral", "crimson", "darkgreen", "darkblue", "deeppink"]
t_wack.width("10")#increase the thickness of the line
t_wack.speed(10)#set movement speed 

import random as r

def random_walk(): 
    m = 20
    direction = [0, 90, 180, 270]
    for i in range(100):
        t_wack.color(r.choice(pen))
        t_wack.forward(m)
        t_wack.right(r.choice(direction))
    
   
random_walk()  
       
    

screen = t.Screen()
screen.exitonclick()
