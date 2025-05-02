/*Write a program that calculates the Body Mass
Index (BMI) from a user's weight and height. */

function calculateBMI(weight, height) {
  // Calculate BMI using the formula: weight (kg) / (height (m) * height (m))
  const bmi = weight / (height * height);
  return bmi;
}

/*const w = +prompt("Enter your weight in kg");
const h = +prompt("Enter your heght in meters");*/

let userBMI = calculateBMI(100, 159);

console.log(`Your body mass index is ${userBMI}`);


