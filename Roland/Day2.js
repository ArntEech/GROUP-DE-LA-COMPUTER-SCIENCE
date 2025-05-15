//Exercise 5

function sumDigits(number){
    let sum = 0;
    let numString = number.toString();

    for (let digit of numString){
        sum +=parseInt(digit);
    }

    return sum;
}

sumDigits(234);

//Exercise 6

const userHeight = prompt("Input your height");
const userWeight = prompt("Input your weight");

function BMI(userHeight,userWeight){
    return userWeight/(userHeight*userHeight);
}

