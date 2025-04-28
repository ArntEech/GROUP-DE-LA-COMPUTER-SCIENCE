const prompt=require("prompt-sync")({sigint:true}); 
 

let greetings="Welcome to the Band Name Generator!";
const userInput = prompt("Enter the name of the city you grew up in:");
const userPet=prompt("Enter the name of your pet:");
let bandName=userInput + " " + userPet;
console.log(greetings + " " + bandName);