#average height
import math
heights = list(map(int, input("Enter the list of heights:\n").split()))
total= 0

for height in heights:
    total += height

average = total / len(heights)
rounded_average = math.ceil(average)
print(f"The average height: {rounded_average}")