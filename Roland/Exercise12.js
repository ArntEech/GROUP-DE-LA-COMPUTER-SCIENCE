//Exercise 12
const maleName = prompt("What is your name?").toLowerCase;
const femaleName = prompt("What is your name?").toLowerCase;

function countLetters(str, word){
    return [...word.toLowerCase()].reduce((total, char) => 
        total + (str.split(char).length - 1), 0);
};

const maleScore = countLetters(maleName, "true") + countLetters(maleName, "LOVE");
const femaleScore = countLetters(femaleName, "TRUE") + countLetters(femaleName, "love");

const finalScore = maleScore + femaleScore;
console.log(finalScore + "%");