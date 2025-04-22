import { word_list} from './HangmanWords.js';
import { stages, logo} from './HangmanArt.js';

function getRandomWord() {
    const index = Math.floor(Math.random() * word_list.length);
    return word_list[index];
  }

  function displayWord(displayArray) {
    console.log(displayArray.join(' '));
  }
  
  function hangman() {
    console.log(logo);
  
    const chosenWord = getRandomWord();
    const wordLength = chosenWord.length;
    let display = Array(wordLength).fill('_');
    let lives = 6;
    let guessedLetters = new Set();}