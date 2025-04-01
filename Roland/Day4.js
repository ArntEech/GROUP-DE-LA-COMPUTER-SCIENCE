//Exercise13
function coinToss(){
    const coin = [Heads, Tails];
    return coin[Math.floor(Math.random()* coin.length)];
}
console.log(`${coinToss()}`);

//Exercise14
let names = [];
names = prompt("Input the names");

function randomName(){
    return names[Math.floor(Math.random() * names.length())];
}

//Exercise15

const row1 = ["⬜️","⬜️","⬜️"];

const row2 = ["⬜️","⬜️","⬜️"];

const row3 = ["⬜️","⬜️","⬜️"];

const map = [row1, row2, row3];

console.log(`${row1}\n${row2}\n${row3}`);

const position = prompt("Where do you want to put the treasure? ");
