def prime_checker(n):
    if n <= 1:
        print("Not prime")
    else:
        for i in range(2, int(n**0.5) + 1):
            if n % i == 0:
                print("Not prime")
                return
        print("Prime number")

prime_checker(10)