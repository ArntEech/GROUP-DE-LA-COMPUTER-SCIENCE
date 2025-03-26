scores = input("Enter your scores:").split()

for n in range(0, len(scores)):
    scores[n] = int(scores[n])

for n in range(0, (len(scores)-1)):
    if scores[n+1] < scores[n]:
        temp = scores[n]
        scores[n] = scores[n+1]
        scores[n+1] = temp
    
print("The highest score in the class is: {}".format(scores[len(scores)-1]))
