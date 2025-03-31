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
const play = prompt("Input choice").toLowerCase;
if (play != "rock" || play != "paper" || play != "scissors"){
    throw new Error("Input rock or paper or scissors");
    
}
const selection = ["rock", "papers", "scissors"];
function getRandomSelection(selection){
    return Math.floor(Math.random() * selection.length);
}
console.log(`User = ${play} Computer = ${getRandomSelection}`);

console.log("The rules are :\n"+ "Rock beats Scissors\n"+ "Scissors beats Paper\n"+ "Paper beats Rock");

if ((play === "rock" && getRandomSelection ==="scissors") || (play === "scissors" && getRandomSelection ==="paper")|| (play === "paper"&& getRandomSelection === "rock")){
    console.log("User wins");
} else if (play === getRandomSelection){
    console.log("It's a tie play again");
} else if ((play === "scissors" && getRandomSelection ==="rock") || (play === "paper" && getRandomSelection ==="scissors")|| (play === "rock"&& getRandomSelection === "paper")){
    console.log("Computer Wins")
}
=======
=======
>>>>>>> f6b624d2ae59b0d1a253b919d4bf29121f03361d
