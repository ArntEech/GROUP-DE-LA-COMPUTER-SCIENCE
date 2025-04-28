/*
 Instructions:
Write a program that counts the number of characters in a user’s name.

Example:

🔹 Input: Natsu Dragneel
🔹 Output: 13 (since spaces count as characters)
*/

/*using prompt() would have been the most basic but since



we are using the terminal we use a module in node js*/

// Display a prompt for the user
//let user = prompt("What is your name? ");

const user = "Asta Yuno";

let nameEdit = user.trim();

// Display the length of the name
console.log(`Your name has ${nameEdit.length} characters.`);