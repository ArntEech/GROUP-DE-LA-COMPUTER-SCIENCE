// exercise 5
let number = prompt("Enter a two-digit number:");  
let firstDigit = parseInt(number[0]); 
 let secondDigit = parseInt(number[1]);  
 let sum = firstDigit + secondDigit;  
console.log(firstDigit + "+" + secondDigit + "=" + sum);


 //exercise 6
//BMI Calculator 1.0 
 let height = prompt("Enter your height in m");
 let weight = prompt("Enter your weight in kg");
 let BMI = weight / (height * height);
 let roundedBMI = Math.round(BMI);
 console.log("Your Body Mass Index is :" + BMI);


 //exercise7.js
 let age = prompt("What is your current age?");
   age = Number(age); 
    let yearsLeft = 90 - age; 
    let monthsLeft = yearsLeft * 12; 
    let weeksLeft = yearsLeft * 52; 
    let daysLeft = yearsLeft * 365; 
    console.log(`You have ${yearsLeft} years, ${monthsLeft} months, ${weeksLeft} weeks, ${daysLeft} days left.`);