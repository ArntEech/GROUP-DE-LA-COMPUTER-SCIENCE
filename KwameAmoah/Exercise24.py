def paint_area():
    height = float(input("Height of wall?:"))
    width = float(input("Width of wall?:"))

    num_cans = round((height * width)/ 5)
    
    print("You'll need {} cans of paint.".format(num_cans))
                   
paint_area()