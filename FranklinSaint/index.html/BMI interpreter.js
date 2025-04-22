const prompt=require('prompt-sync')();
const userWeight=prompt("Enter your weight in kg: ");
const userHeight=prompt("Enter your height in m: ");
const userBMI=userWeight/(Math.pow(userHeight,2));

if(userBMI<18.5){
    console.log("Your BMI is "+userBMI +" and you're underweight");
}else if(userBMI<24.9){
    console.log("Your BMI is "+userBMI +" and you're normal weight");
}
else if(userBMI<29.9){
    console.log("Your BMI is "+userBMI +" and you're Overweight");
}
else if(userBMI<34.9){
    console.log("Your BMI is "+userBMI +" and you're Obese");
}else{
    console.log("Your BMI is "+userBMI +" and you're Clinically Obese");
}