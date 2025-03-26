// Exercise 9
 if (BMI < 18.5){
    console.log("Underweight")
 } else if (BMI >= 18.5 && BMI <= 24.9){
    console.log("Normal Weight")
 } else if (BMI >= 25 && BMI <= 29.9){
    console.log("Overweight")
 } else if (BMI >= 30 && BMI <= 34.9){
    console.log("Obese")
 } else {
    console.log("Clinically Obese")
 }

// Exercise 10

function isLeapYear(year){
    if ((year % 4 ===0) && ((year % 100 === 0) && (year % 400 === 0))){
        console.log("Year is a leap year")
    }
}
<<<<<<< HEAD
=======

>>>>>>> eca6e850bbdffdcced0bf2dbbe7d79da3cad0218

//Exercise 11
console.log("Welcome to Papa's Pizza");
const size = prompt("What size pizza do you want? S, M, or L");
const pepperoni = prompt("Do you want pepperoni? Y or N");
const cheese = prompt("Do you want extra cheese? Y of N");
let bill = 0;

if (size === "S"){
    bill += 15;
}else if (size === "M"){
    bill += 20;
}else if (size === "L"){
    bill += 25;
}
if ((bill === 20 || bill === 25) && pepperoni === "Y"){
    bill += 3;
} else if (bill === 15 && pepperoni === "Y"){
    bill += 2;
}
if (cheese === "Y"){
    bill += 1;
}

console.log("Your final bill is $"+ bill);

//Exercise 12
const maleName = prompt("What is your name?");
const femaleName = prompt("What is your name?");