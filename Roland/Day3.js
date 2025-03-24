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
