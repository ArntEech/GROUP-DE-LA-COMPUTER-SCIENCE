# prime checker
import math
def P_check(number):
    if number <= 1:
        print(f"{number} is not prime.")
        return False
    if number == 2:
        print(f"{number} is a prime number.")
        return False
    if number % 2 == 0:
        print(f"{number} is not prime.")
        return False
    for i in range(3, int(math.sqrt(number)), 2):
        if number % i == 0: 
            print(f"{number} is not a prime number.")
            return False
    print(f"{number} is a prime number.")
    return True
P_check(27)


    
