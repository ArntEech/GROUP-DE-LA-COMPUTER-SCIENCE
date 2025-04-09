# 🪓 Mini Project - Hangman Guessing Game

## 🎯 Objective:
Create a **word-guessing game** (Hangman) where the player tries to guess a secret word, one letter at a time. If they guess incorrectly, they lose a life. The game continues until the player either correctly guesses all the letters or loses all their lives.

---

## 🧩 Game Rules:
- A random word is selected from a predefined list.
- The word is hidden from the user and shown as blank spaces (underscores).
- The player can guess one letter at a time.
- If the guessed letter exists in the word, reveal its position(s).
- If the guess is wrong, reduce the number of remaining lives.
- If the player runs out of lives, the game ends and the correct word is revealed.
- If the player guesses all letters correctly before losing all lives, they win.

---

## 💡 Features You Must Implement:

✅ Display a **Hangman ASCII art logo**.  

✅ Use **external files/modules or equivalent** (e.g., use a separate data source for the words and the ASCII stages).  

✅ Use **functions**, **lists**, **loops**, **conditionals**, and **string manipulation** to manage game logic.  

✅ Show a **visual Hangman stage** as the player loses lives.  

✅ Inform the user if they've already guessed a letter.  

✅ Display correct feedback after each guess (win/lose/update).

---

## 💻 Example Input/Output:
```text
 _
| |
| |__   __ _ _ __   __ _ _ __ ___   __ _ _ __  
| '_ \ / _` | '_ \ / _` | '_ ` _ \ / _` | '_ \ 
| | | | (_| | | | | (_| | | | | | | (_| | | | |
|_| |_|\__,_|_| |_|\__, |_| |_| |_|\__,_|_| |_|
                    __/ |
                   |___/    
Guess a letter: e
_ _ _ _ _ _ _ e

  +---+
  |   |
      |
      |
      |
      |
=========

Guess a letter: n
You've guess the letter 'n', which is not in the word
You have 5 lives remaining
_ _ _ _ _ _ _ e

  +---+
  |   |
  O   |
      |
      |
      |
=========

Guess a letter: t
You've guess the letter 't', which is not in the word
You have 4 lives remaining
_ _ _ _ _ _ _ e

  +---+
  |   |
  O   |
  |   |
      |
      |
=========

Guess a letter: h
You've guess the letter 'h', which is not in the word
You have 3 lives remaining
_ _ _ _ _ _ _ e

  +---+
  |   |
  O   |
 /|   |
      |
      |
=========
Guess a letter: c
You've guess the letter 'c', which is not in the word
You have 2 lives remaining
_ _ _ _ _ _ _ e

  +---+
  |   |
  O   |
 /|\  |
      |
      |
=========

Guess a letter: n
You've guess the letter 'n', which is not in the word
You have 1 lives remaining
_ _ _ _ _ _ _ e

  +---+
  |   |
  O   |
 /|\  |
 /    |
      |
=========

Guess a letter: q 
You've guess the letter 'q', which is not in the word
You have 0 lives remaining
The word you tried to guess was 'vaporize'. Better luck next time

You lose.
_ _ _ _ _ _ _ e

  +---+
  |   |
  O   |
 /|\  |
 / \  |
      |
=========
```

+ You are to create a folder called, project7.
+ In the folder, create three files
  - A `main` file for your game logic, function/method calls and input statements
  - A file named `Hangman_words` to contain a list/array of possible words to be selected at random in the main file
  - A file named `Hangman_art`  to contain the art for the Hangman logo and stages art

### Hangman_words( Make the extension in your programming language equivalent)
``` python
word_list = [
'abruptly', 
'absurd', 
'abyss', 
'affix', 
'askew', 
'avenue', 
'awkward', 
'axiom', 
'azure', 
'bagpipes', 
'bandwagon', 
'banjo', 
'bayou', 
'beekeeper', 
'bikini', 
'blitz', 
'blizzard', 
'boggle', 
'bookworm', 
'boxcar', 
'boxful', 
'buckaroo', 
'buffalo', 
'buffoon', 
'buxom', 
'buzzard', 
'buzzing', 
'buzzwords', 
'caliph', 
'cobweb', 
'cockiness', 
'croquet', 
'crypt', 
'curacao', 
'cycle', 
'daiquiri', 
'dirndl', 
'disavow', 
'dizzying', 
'duplex', 
'dwarves', 
'embezzle', 
'equip', 
'espionage', 
'euouae', 
'exodus', 
'faking', 
'fishhook', 
'fixable', 
'fjord', 
'flapjack', 
'flopping', 
'fluffiness', 
'flyby', 
'foxglove', 
'frazzled', 
'frizzled', 
'fuchsia', 
'funny', 
'gabby', 
'galaxy', 
'galvanize', 
'gazebo', 
'giaour', 
'gizmo', 
'glowworm', 
'glyph', 
'gnarly', 
'gnostic', 
'gossip', 
'grogginess', 
'haiku', 
'haphazard', 
'hyphen', 
'iatrogenic', 
'icebox', 
'injury', 
'ivory', 
'ivy', 
'jackpot', 
'jaundice', 
'jawbreaker', 
'jaywalk', 
'jazziest', 
'jazzy', 
'jelly', 
'jigsaw', 
'jinx', 
'jiujitsu', 
'jockey', 
'jogging', 
'joking', 
'jovial', 
'joyful', 
'juicy', 
'jukebox', 
'jumbo', 
'kayak', 
'kazoo', 
'keyhole', 
'khaki', 
'kilobyte', 
'kiosk', 
'kitsch', 
'kiwifruit', 
'klutz', 
'knapsack', 
'larynx', 
'lengths', 
'lucky', 
'luxury', 
'lymph', 
'marquis', 
'matrix', 
'megahertz', 
'microwave', 
'mnemonic', 
'mystify', 
'naphtha', 
'nightclub', 
'nowadays', 
'numbskull', 
'nymph', 
'onyx', 
'ovary', 
'oxidize', 
'oxygen', 
'pajama', 
'peekaboo', 
'phlegm', 
'pixel', 
'pizazz', 
'pneumonia', 
'polka', 
'pshaw', 
'psyche', 
'puppy', 
'puzzling', 
'quartz', 
'queue', 
'quips', 
'quixotic', 
'quiz', 
'quizzes', 
'quorum', 
'razzmatazz', 
'rhubarb', 
'rhythm', 
'rickshaw', 
'schnapps', 
'scratch', 
'shiv', 
'snazzy', 
'sphinx', 
'spritz', 
'squawk', 
'staff', 
'strength', 
'strengths', 
'stretch', 
'stronghold', 
'stymied', 
'subway', 
'swivel', 
'syndrome', 
'thriftless', 
'thumbscrew', 
'topaz', 
'transcript', 
'transgress', 
'transplant', 
'triphthong', 
'twelfth', 
'twelfths', 
'unknown', 
'unworthy', 
'unzip', 
'uptown', 
'vaporize', 
'vixen', 
'vodka', 
'voodoo', 
'vortex', 
'voyeurism', 
'walkway', 
'waltz', 
'wave', 
'wavy', 
'waxy', 
'wellspring', 
'wheezy', 
'whiskey', 
'whizzing', 
'whomever', 
'wimpy', 
'witchcraft', 
'wizard', 
'woozy', 
'wristwatch', 
'wyvern', 
'xylophone', 
'yachtsman', 
'yippee', 
'yoked', 
'youthful', 
'yummy', 
'zephyr', 
'zigzag', 
'zigzagging', 
'zilch', 
'zipper', 
'zodiac', 
'zombie', 
]
```

### Hangman_art 
```python
stages = ['''
  +---+
  |   |
  O   |
 /|\  |
 / \  |
      |
=========
''', '''
  +---+
  |   |
  O   |
 /|\  |
 /    |
      |
=========
''', '''
  +---+
  |   |
  O   |
 /|\  |
      |
      |
=========
''', '''
  +---+
  |   |
  O   |
 /|   |
      |
      |
=========''', '''
  +---+
  |   |
  O   |
  |   |
      |
      |
=========
''', '''
  +---+
  |   |
  O   |
      |
      |
      |
=========
''', '''
  +---+
  |   |
      |
      |
      |
      |
=========
''']


logo = ''' 
 _                                             
| |                                            
| |__   __ _ _ __   __ _ _ __ ___   __ _ _ __  
| '_ \ / _` | '_ \ / _` | '_ ` _ \ / _` | '_ \ 
| | | | (_| | | | | (_| | | | | | | (_| | | | |
|_| |_|\__,_|_| |_|\__, |_| |_| |_|\__,_|_| |_|
                    __/ |                      
                   |___/    '''
```
### 🧠 Remember:
+ Import from `hangman_words` and `hangman_art` files into `main` file using your programming language's import/module system.

+ Keep your folder and files organized exactly as described.

+ Your game output and behavior should be consistent with the original version.

🎉 Good luck, and have fun building your own version of Hangman! 🎯

To know more about the original game, use the link below:
 - https://en.wikipedia.org/wiki/Hangman_(game)
