/*
 Instructions:
Write a program that counts the number of characters in a user’s name.

Example:

🔹 Input: Natsu Dragneel
🔹 Output: 13 (since spaces count as characters)
*/

/*using prompt() would have been the most basic but since

 let name = prompt = ("What is your name", "");
 console.log(name.length);

we are using the terminal we use a module in node js*/

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});



rl.question("What is your name?\En", (answer) => {
    console.log(answer.length);
    rl.close();

})
