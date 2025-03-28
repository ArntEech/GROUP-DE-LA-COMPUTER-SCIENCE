sum = 0

for n in range(0, 101):
    if n%2 == 0:
        sum += n
    else:
        continue

print(sum)
