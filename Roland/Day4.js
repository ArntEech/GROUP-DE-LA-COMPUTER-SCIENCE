//Exercise13
function coinToss(){
    const coin = ["Heads", "Tails"];
    return coin[Math.floor(Math.random()* coin.length)];
}
console.log(`${coinToss()}`);

//Exercise14
let names = [];
names = (prompt("Input the names\n")).split(",").map(name => name.trim());;

function randomName(){
    return names[Math.floor(Math.random() * names.length)];
}

console.log(`${randomName()} is paying today`);

//Exercise15

const row1 = ["😙","😙","😙"];
const row2 = ["😙","😙","😙"];
const row3 = ["😙","😙","😙"];

const map = [row1, row2, row3];

console.log(`${row1}\n${row2}\n${row3}`);
const position = prompt("Where do you want to put the treasure? \n");

if (position > 33){
    throw new Error("Input should follow a 3x3 matrix");
}
let column = parseInt(position[0]) - 1;
let row = parseInt(position[1]) - 1;

if (column >= 0 && column < 3 && row >= 0 && row < 3) {
  map[row][column] = "❌";}

console.log("Updated Map:");
map.forEach(row => console.log(row.join(" ")));