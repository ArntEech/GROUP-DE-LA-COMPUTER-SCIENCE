#Write a program that adds the digits in a two-digit number.


digit = input('two digit number: ')

first = digit[0]
second = digit[1]


if len(digit) == 2: 
    if first.isnumeric() and second.isnumeric():          
        sum = int(first) + int(second)
        print(sum)
    else: 
        print('the input is not numeric')
else: 
    print('digits is longer than two')


