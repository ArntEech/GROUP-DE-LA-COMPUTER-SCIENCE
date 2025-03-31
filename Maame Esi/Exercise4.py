# Write a program that **switches** the values stored in the variables `a` and `b`.  

a = input('a: ')
b = input('b: ')
print(a,b)

if a and b: 
    oldA = a
    oldB = b
    a = oldB 
    b = oldA

print(a,b)
