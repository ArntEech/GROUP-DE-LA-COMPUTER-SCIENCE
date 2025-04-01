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
=======
