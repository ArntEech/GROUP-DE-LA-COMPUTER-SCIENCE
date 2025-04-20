def paint_calc(height, width, coverage):
    numberOfCans = (height * width) / coverage
    numberOfCans = round(numberOfCans)
    return int(numberOfCans)

test_h = int(input("Height of wall: "))
test_w = int(input("Width of wall: "))
coverage = 5

result = paint_calc(test_h, test_w, coverage)

print(f"You'll need {result} cans of paint")