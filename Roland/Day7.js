//Exercise 25
const height = parseInt(prompt("What is the height of the wall? \n"));
const width = parseInt(prompt("What is the width of the wall? \n"));

function calculate(){
    return Math.ceil((height * width)/5);
}
console.log(`You will need ${calculate()} cans of paint to complete the job`);