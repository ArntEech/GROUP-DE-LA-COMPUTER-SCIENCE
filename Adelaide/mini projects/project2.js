// Tip Calculator -- Project2 
console.log("Welcome to the Tip Calculator!");

//User Input.
const totalBill = parseFloat(prompt("What's the toal bill amount?"));
const tipPercentage = parseFloat(prompt("What's the tip percentage?"));
const numberOfPeople = parseInt(prompt("How many people will split the bill?"));

//Tip and Total Amount.
 const tipAmount = (totalBill * tipPercentage) / 100;
 const totalAmount = totalBill + tipAmount;
 const amountPerPerson = totalAmount / numberOfPeople;

 //Display the result.
 console.log(`Each person should pay: $${amountPerPerson.toFixed(2)}`);




