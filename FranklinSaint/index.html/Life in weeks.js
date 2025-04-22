
 const prompt=require('prompt-sync')();
const currentAge=prompt("What is your current age? ");
const yearsLeft=90-currentAge;
const daysLeft=yearsLeft*365;
const weeksLeft=yearsLeft*52;
const monthsLeft=yearsLeft*12;
console.log("You have " +daysLeft +"days "+weeksLeft +"weeks " +monthsLeft+"months left");
