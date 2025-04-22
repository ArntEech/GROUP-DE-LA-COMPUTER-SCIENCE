import { word_list} from './HangmanWords.js';
import { stages, logo} from './HangmanArt.js';

function getRandomWord() {
    const index = Math.floor(Math.random() * word_list.length);
    return word_list[index];
  }