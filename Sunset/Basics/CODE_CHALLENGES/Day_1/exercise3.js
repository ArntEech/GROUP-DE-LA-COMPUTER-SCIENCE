/*
 Instructions:
Write a program that counts the number of characters in a user’s name.

Example:

🔹 Input: Natsu Dragneel
🔹 Output: 13 (since spaces count as characters)
*/

/*using prompt() would have been the most basic but since

 let name = prompt ("What is your name", "");
 console.log(name.length);

we are using the terminal we use a module in node js*/

// This program counts the number of characters in a user's name, including spaces.

// Display a prompt for the user
//let user = prompt("What is your name? ");

const user = "Asta Yuno";

let nameEdit = user.trim();

// Display the length of the name
console.log(`Your name has ${nameEdit.length} characters.`);
