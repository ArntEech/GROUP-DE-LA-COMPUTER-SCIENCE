/*
Write a program that adds the digits in a two-digit number
*/

function digitAdd(num) {
  // Convert the number to a string to access individual digits
  const numStr = num.toString();

  // Extract the first and second digits and convert them back to numbers
  const firstDigit = parseInt(numStr[0]);
  const secondDigit = parseInt(numStr[1]);

  // Add the two digits together
  const sum = firstDigit + secondDigit;

  return sum;
}
