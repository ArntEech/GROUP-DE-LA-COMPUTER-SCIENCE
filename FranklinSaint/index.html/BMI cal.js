const prompt=require('prompt-sync')();
const userWeight=prompt("Enter your weight in kg: ");
const userHeight=prompt("Enter your height in m: ");
let userBMI=Math.round(userWeight/(Math.pow(userHeight,2)));

console.log("Your BMI is: "+userBMI);