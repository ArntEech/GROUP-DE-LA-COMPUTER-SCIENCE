/*Write a program that interprets the Body Mass Index (BMI) on a user's weight and height.
 It should tell them the interpretation of thier BMI value.*/

 function calculateBMI(weight, height) {
    const bmi = Math.floor(weight / (height * height));
    return bmi;
  }
  
  /*const w = +prompt("Enter your weight in kg");
  const h = +prompt("Enter your heght in meters");*/
  
  let bmi = calculateBMI(100, 2.19);
  var observation;

  if (bmi < 18.5) {
    observation = 'Underweight';
  }else if(bmi < 24.9){
    observation = 'Normal weight';
  }else if(bmi < 29.9){
    observation = 'Overweight';
  }else if(bmi < 34.9) {
    observation = 'obese';
  }else{
    observation = 'clinically Obese'
  }

  console.log(`Your BMI is ${bmi}, you are ${observation}`)
  