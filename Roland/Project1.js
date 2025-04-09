console.log("Welcome new user");
const city = prompt("What's the name of the city you grew up in?\n").trim();
const petName = prompt("What's your pet's name?\n").trim();

if (!city || !petName){
    alert("Please provide required information");
}
function nameGen(){
    return `${city} ${petName}`;
}
console.log(`Your band name is ${nameGen()}`);


//Project 2
console.log("Welcome to checkout");
let bill = parseFloat(prompt("What is your bill amount\n"));
const rate = parseFloat(prompt("Choose your preferred percentage 10,12,15\n"));
const num = parseInt(prompt("How many ways will the bill be split\n"));

function finalBill(){
    tip = (rate/100)* bill;
    bill += tip;
    return (bill/num).toFixed(2);
}

console.log(`Each person would pay $ ${finalBill()}`);

//Project 3
console.log("Welcome to Rock,Paper,Scissors ultimate");
const move = prompt("Input choice\n").toString().toLowerCase();
const play = move.trim();
if (play != "rock" && play != "paper" && play != "scissors"){
    throw new Error("Input rock or paper or scissors");
}

function getRandomSelection(){
    const selection = ["rock", "paper", "scissors"];
    return selection[Math.floor(Math.random() * selection.length)];
}
console.log(`User = ${play} Computer = ${getRandomSelection()}\n`);

console.log("The rules are :\n"+ "Rock beats Scissors\n"+ "Scissors beats Paper\n"+ "Paper beats Rock\n\n");

if ((play === "rock" && getRandomSelection() ==="scissors") || (play === "scissors" && getRandomSelection() ==="paper")|| (play === "paper"&& getRandomSelection() === "rock")){
    console.log("User wins");
} else if (play === getRandomSelection()){
    console.log("It's a tie play again");
} else if ((play === "scissors" && getRandomSelection() ==="rock") || (play === "paper" && getRandomSelection() ==="scissors")|| (play === "rock"&& getRandomSelection() === "paper")){
    console.log("Computer Wins")
}
//Project 4

let letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'];

let numbers = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9'];

let symbols = ['!', '#', '$', '%', '&', '(', ')', '*', '+'];

function generatePassword(){
const numLetters = parseInt(prompt("Number of letters\n"));
const numSymbols = parseInt(prompt("Number of symbols\n"));
const numNumbers = parseInt(prompt("Number of numbers\n"));

const letterCharacters = Array.from({ length: numLetters }, () => letters[Math.floor(Math.random() * letters.length)]);
const symbolCharacters = Array.from({ length: numSymbols }, () => symbols[Math.floor(Math.random() * symbols.length)]);
const numberCharacters = Array.from({ length: numNumbers }, () => numbers[Math.floor(Math.random() * numbers.length)]);

const allChars = [...letterCharacters, ...symbolCharacters, ...numberCharacters];
  for (let i = allChars.length - 1; i > 0; i--) {
    const j = Math.floor(Math.random() * (i + 1));
    [allChars[i], allChars[j]] = [allChars[j], allChars[i]];
  }

  // Convert to string and return
  console.log( allChars.join(''));
  
}

generatePassword();

//Project 5

console.log("Welcome to Treasure Island.");
console.log("Your mission is to find the treasure.");

let gameOver = false
let decision

while (!gameOver){
    try{
    decision = prompt("You're at a crossroad. Where do you want to go? Type \"left\" or \"right\"\n").toLowerCase();

    if (decision === "right"){
        console.log("You've fallen into a hole, GAME OVER");
        gameOver = true;
        break;
    } else if (decision === "left"){
        console.log("You've come to a lake");
    } else {
        throw new Error ("Make sure to input Left or Right");
    }
    }
    catch(error){
        console.log(error.message)
    }


    try{
       decision = prompt("There is an island in the middle of the lake. Type \"wait\" to wait for a boat. Type \"swim\" to swim across.\n").toLowerCase();
       
       if (decision === "wait"){
           console.log("You arrive at the island unharmed");
           
       } else if (decision === "swim"){
           console.log("You were attacked and killed by trout, GAME OVER");
           gameOver = true;
           break;
       } else {
           throw new Error ("Make sure to input wait or swim");
       }
    }
    catch (error){ console.log(error.message) }
    
    
        decision = prompt("There is a house with 3 doors. One red, one yellow and one blue. Which colour do you choose?\n").toLowerCase();
        
        if (decision === "red"){
            console.log("It's a room full of fire. GAME OVER");
            gameOver = true;
            break;
        } else if (decision === "yellow"){
            console.log("You found the treasure! You Win!");
            break;
        }else if (decision === "blue"){
            console.log("You enter a room of beasts. GAME OVER");
            gameOver = true;
            break;
        } else { console.log("You chose a door that doesn't exist. GAME OVER.")
            gameOver = true;
            break;
        }
}