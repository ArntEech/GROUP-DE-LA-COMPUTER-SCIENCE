def reverseString(input):
    return ''.join(reversed(input))


wordInput = input("Enter a word to reverse: ")
print(f"Reversed word: {reverseString(wordInput)}")