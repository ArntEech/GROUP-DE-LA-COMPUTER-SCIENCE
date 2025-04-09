#Project 6 - Hangman Guessing Game
import random
import hangman_art as art
import hangman_words as hw


chosen_word = random.choice(hw.word_list)
word_length = len(chosen_word)

end_of_game = False
lives = 6


print(art.logo)

#Create blanks
display = []
for _ in range(word_length):
    display += "_"

while not end_of_game:
    guess = input("Guess a letter: ").lower()

    if guess in display:
        print(f"You've already guessed '{guess}'")
    #Check guessed letter
    for position in range(word_length):
        letter = chosen_word[position]
        if letter == guess:
            display[position] = letter

    #Check if user is wrong.
    if guess not in chosen_word:
        tracker = lives -1
        print(f"You've guess the letter '{guess}', which is not in the word\nYou have {tracker} lives remaining")
        lives -= 1
        if lives == 0:
            end_of_game = True
            print(f"The word you tried to guess was '{chosen_word}'. Better luck next time\n")
            print("You lose.")

    #Join all the elements in the list and turn it into a String.
    print(f"{' '.join(display)}")

    #Check if user has got all letters.
    if "_" not in display:
        end_of_game = True
        print("You win.")

    
    print(art.stages[lives])